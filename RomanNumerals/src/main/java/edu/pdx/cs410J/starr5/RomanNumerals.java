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
      table.put(3,"III");
      table.put(4,"IV");
      table.put(5,"V");
      table.put(6,"VI");
      table.put(7,"VII");
      table.put(8,"VIII");
      table.put(9,"IX");
      table.put(10,"X");
      table.put(20,"XX");
      table.put(30,"XXX");
      table.put(40,"XL");
      table.put(50,"L");
      table.put(60,"LX");
      table.put(70,"LXX");
      table.put(80,"LXXX");
      table.put(90,"XC");
      table.put(100,"C");
      table.put(200,"CC");
      table.put(300,"CCC");
      table.put(400,"CD");
      table.put(500,"D");
      table.put(600,"DC");
      table.put(700,"DCC");
      table.put(800,"DCCC");
      table.put(900,"CM");
      table.put(1000,"M");
      table.put(2000,"MM");
      table.put(3000,"MMM");
//      if(table.get(Integer.toString(numberRepresentation)))
//      while(numberRepresentation>0){
//        int remainder  = numberRepresentation%10;
//        if(table.get(remainder))
//      }
      return "0";
    }
  }

}