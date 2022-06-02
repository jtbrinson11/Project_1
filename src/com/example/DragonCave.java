package com.example;

import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {

        //display game start
        System.out.println("\nYou are in place that is full of different dragons. \nThere is a fork in the path ahead that has two caves. \n" +
                "Each cave has a dragon inside of it. \nOne has a friendly dragon inside that will share his treasure with you. \n" +
                "The other has a hungry dragon that will eat you. \nWhich cave will you go into? \n");

        //takes user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Make your choice (1 or 2): ");

        String input = scan.next();
        int choice = 0;

        //processes outcome with try/catch block to handle invalid user input
        double outcome = (Math.random() <= 0.5) ? 1 : 2;
        try
        {
            choice = Integer.parseInt(input);
        }
        catch (Exception e)
        {
            System.out.println("Sorry, your input was invalid. Good-bye.");
            System.exit(-1);
        }

        if (outcome == choice)
        {
            System.out.println("You approach the cave and carefully step in . . . \n" +
                    "It's dark, cold, and moist . . . \n" +
                    "You hear a noise! A dragon is staring directly at you! \n" +
                    "It charges towards you, and eats you where you stand! \nThe End");
        }
        else
        {
            System.out.println("You approach the cave and carefully step in . . . \n" +
                    "You have a strange feeling walking inside . . . \n" +
                    "You spot a dragon! But it's just sitting there. \n" +
                    "It moves off to the side, to share its treasure with you. \nThe End");
        }


    }
}
