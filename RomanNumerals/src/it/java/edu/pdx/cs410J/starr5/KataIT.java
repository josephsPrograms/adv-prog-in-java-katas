package edu.pdx.cs410J.starr5;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

public class KataIT extends InvokeMainTestCase {

  @Test
  public void invokingMainWithNoArgumentsHasExitCodeOf1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RomanNumerals.class);
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  public void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RomanNumerals.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  public void invokeConvertWithZero() {
    String arguments = "0";
    InvokeMainTestCase.MainMethodResult result = invokeMain(RomanNumerals.class, arguments);
    assertThat(result.getTextWrittenToStandardError(), containsString("Cannot convert zero to a roman numeral"));
    assertThat(result.getExitCode(), CoreMatchers.equalTo(1));
  }

  @Test
  public void invokeConvertOverThreeThousand() {
    String arguments = "3001";
    InvokeMainTestCase.MainMethodResult result = invokeMain(RomanNumerals.class, arguments);
    assertThat(result.getTextWrittenToStandardError(), containsString("Cannot convert numbers over 3000"));
    assertThat(result.getExitCode(), CoreMatchers.equalTo(1));
  }

}
