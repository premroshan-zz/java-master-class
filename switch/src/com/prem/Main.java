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
        char switchCharacter = 'A';
        switch (switchCharacter){
            case 'A':
                System.out.println("Character A");
                break;
            case 'B':
                System.out.println("Character B");
                break;
            case 'C':
                System.out.println("Character C");
                break;
            case 'D':
                System.out.println("Character D");
                break;
            default:
                System.out.println("Something Else");

        }

    }
}
