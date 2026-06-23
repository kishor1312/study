package com.dsa.twop;

import java.util.Scanner;

public class StairBlocks {
    public static void main(String[] args) {
        int totalBlocks = new Scanner(System.in).nextInt();

        // approach1
        if (totalBlocks <= 0) {
            System.out.println("Invalid no. of input blocks");
            return;
        }
        int level = 1; //stair_level
        int utilizedBlocks = 0; //blocks

        while (utilizedBlocks + level <= totalBlocks) {
            utilizedBlocks += level;
            //print
            level++;
        }
        System.out.println("Levels possible: " + (level-1) + ", blocks left: " +(totalBlocks - utilizedBlocks));


        //approach2
        // int height = getMaxHeightPossible(totalBlocks);
    }

}
