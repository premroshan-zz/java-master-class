package com.prem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;

        result = result - 1; //3 -1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5 ;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 mod 3 = " + result);

        //result = result + 1
        result++; // 1 + 1
        System.out.println("One plus one = " + result);

        result--;
        System.out.println("Two minus one = " + result);

        result += 2; // result = result + 2
        System.out.println("One Plus two = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 -2 =" + result);

        boolean isAlien = false;
        if(isAlien == true) {
            System.out.println("It is not an alien");
            System.out.println("And i am scared of aliens");
        }
    }
}
