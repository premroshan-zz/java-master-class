package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByteValue = 50;
        short myShortValue = 10500;
        int myIntValue = 50500;
        long myLongValue = 50000 + 10 * ( myByteValue + myShortValue + myIntValue );

        System.out.println("The total is = " + myLongValue);

        //additional parts
        short myTotalShortValue = (short) ( myShortValue + myShortValue );
        System.out.println(myTotalShortValue);
    }
}
