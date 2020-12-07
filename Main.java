package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play? (yes/no)");
        String answer = scanner.nextLine();
        if (answer == "yes") {
            System.out.println("Welcome to the Game, You come across a two way street. Which way do you want to go (left/right)");
            Scanner scanner1 = new Scanner(System.in);
            String answer1 = scanner.nextLine();
            if (answer1 == "left") {
                System.out.println("You were walking and encountered a monster. Do you want to attack or run?(attack/run)");
                Scanner scanner2 = new Scanner(System.in);
                String answer2 = scanner.nextLine();
                if (answer2 == "attack") {
                    System.out.println("aaww!! You're too week to fight. GAME OVER");
                } else {
                    System.out.println("You escaped successfully. On to next level. MISSION ACCOMPLISHED. RESULT : WINNER. Wait for next level");
                }

            } else {
                System.out.println("You are in a garden. You saw fruits. Do you want to eat or let go (eat/let go)");
                Scanner scanner3 = new Scanner(System.in);
                String answer3 = scanner.nextLine();
                if (answer3 == "eat") {
                    System.out.println("Health is good. On to next level. MISSION ACCOMPLISHED : WINNER. Wait for next level");
                } else {
                    System.out.println("bad health conditions. GAME OVER");
                }


            }
        } else {
            System.out.println("That's bad");
        }
    }
}