package edu.pdx.cs410J.starr5;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RomanNumerals {
                                                                                    

  public static void main(String[] args) {
    if(args.length ==  0) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    }
    String result = convert(args[0]);
    if(result.equals("Cannot convert zero to a roman numeral") || result.equals("Cannot convert numbers over 3000")) {
      System.err.println(result);
      System.exit(1);
    }
  }

  public static String convert(String number) {
    int numberRepresentation = Integer.parseInt(number);
    if(numberRepresentation == 0) {
      return "Cannot convert zero to a roman numeral";
    } else if(numberRepresentation > 3000) {
      return "Cannot convert numbers over 3000";
    } else {
      Map<Integer,String> table = new HashMap<>();
      table.put(1, "I");
      table.put(2, "II");
      return "0";
    }
  }

}