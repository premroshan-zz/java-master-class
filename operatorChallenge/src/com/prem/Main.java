package com.prem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myResult = ( myFirstDouble + mySecondDouble ) * 100.00d;
        System.out.println(myResult);
        double myRemainder = myResult % 40.00d;
        System.out.println("The remainder is = " + myRemainder);

        boolean result = ( myRemainder == 0.00 ) ? true : false;

        System.out.println(result);

        if(!result){
            System.out.println("Got some remainder");
        }
    }
}
