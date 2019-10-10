package com.example.parsingvaluesfromstring;

public class ParsingValuesFromString {
    public static void main(String[] args) {

        //Parsing a string into a double
        String intAsString = "2018";
        System.out.println("intAsString= " + intAsString);

        int intNumber = Integer.parseInt(intAsString);
        System.out.println("number= " + intNumber);

        //Test to add 1 to string intAsString
        intAsString += 1;
        //Test to add 1 to intNumber that has been converted into a integer from a string
        intNumber +=1;

        System.out.println("numberAsString= " + intAsString);
        System.out.println("number= " + intNumber);

        //Parsing a string into a double
        System.out.println("");
        String doubleAsString = "2018.125";
        System.out.println("doubleAsString= " + doubleAsString);

        double doubleNumber = Double.parseDouble(doubleAsString);
        System.out.println("number= " + doubleNumber);

        //Test to add 1 to string doubleAsString
        doubleAsString += 1;
        //Test to add 1 to doubleNumber that has been converted into a double from a string
        doubleNumber +=1;

        System.out.println("numberAsString= " + doubleAsString);
        System.out.println("number= " + doubleNumber);
    }
}
