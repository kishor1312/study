package com.misc;

public class TestReverseInteger {

    // basic without mutating original value

    public static void main(String[] args) {
        int inputInt = 323021;
        int reducedInt = 0;
        int reversedInt = 0;
        do {
            int modVal;
            if (reducedInt == 0) {
                modVal = inputInt % 10;
                reducedInt = inputInt / 10;
            } else {
                modVal = reducedInt % 10;
                reducedInt = reducedInt / 10;
            }
            reversedInt = reversedInt * 10 + modVal;
        } while (reducedInt > 10);
        System.out.println(reversedInt * 10 + reducedInt);
    }

    //without mutation of original value
    /*
    public static void main(String[] args) {
        int inputInt = 12340;

        int temp = inputInt;
        int reversedInt = 0;
        while(temp != 0) {
            int modVal = temp % 10;
            reversedInt = reversedInt * 10 + modVal;
            temp = temp / 10;
        }

        System.out.println(reversedInt);
    }
    */
}
