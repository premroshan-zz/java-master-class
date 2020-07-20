package com.prem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue = 2;
        switch (switchValue){
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                break;
            default:
                System.out.println("was other than 1 - 5");
                break;
        }
    }
}
