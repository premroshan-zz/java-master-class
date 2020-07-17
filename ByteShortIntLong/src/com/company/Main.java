package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);

        //byte data type
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value = " + myMinByteValue);
        System.out.println("Maximum Byte Value = " + myMaxByteValue);

        //short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Value = " + myMinShortValue);
        System.out.println("Maximum Short Value = " + myMaxShortValue);

        long myLongValue = 100L;

        //long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Minimum Long Value = " + myMinLongValue);
        System.out.println("Maximum Long Value = " + myMaxLongValue);

        long bigLongIntValue = 21474836471234L;

        System.out.println(bigLongIntValue);

        int myNewIntValue = myMinIntValue / 2;
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) ( myMinShortValue / 2);
    }
}
