package com.prem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "This is a string";
        System.out.println("Mystring is equal to " + myString);
        myString = myString + " and this is more";
        System.out.println("This is my modified string " + myString );
        myString = myString + " \u00A9 2020";
        System.out.println(myString);
        String numberString = "500.25";
        System.out.println(numberString + "200.25");
        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println("Last string = " + lastString);
    }
}
