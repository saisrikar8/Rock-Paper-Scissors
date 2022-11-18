package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RPS();
    }

    public static void RPS() {
        System.out.println("Rock, Paper, Scissors\nWhat do you want to play?:\nEnter 1 for rock\nEnter 2 for paper\nEnter 3 for scissors");
        System.out.println("\nEnter here: ");
        int randomNum = (new Random()).nextInt(3);
        int input = (new Scanner(System.in)).nextInt();
        if (randomNum == 0) {
            switch (input) {
                case 1 -> System.out.println("Tie!");
                case 2 -> System.out.println("You won!");
                case 3 -> System.out.println("You lost!");
                default -> System.out.println("It seems your input did not compute");
            }
            System.out.println("The computer played...");
            System.out.println("rock!");

        }
        else if (randomNum == 1) {
            switch (input) {
                case 1 -> System.out.println("You lost!");
                case 2 -> System.out.println("Tie!");
                case 3 -> System.out.println("You won!");
                default -> System.out.println("It seems your input did not compute;");
            }
            System.out.println("The computer played...");
            System.out.println("paper!");

        }
        else if (randomNum == 2) {
            switch (input) {
                case 1 -> System.out.println("You won!");
                case 2 -> System.out.println("You Lost!");
                case 3 -> System.out.println("Tie!");
                default -> System.out.println("It seems your input did not compute;");
            }
            System.out.println("The computer played...");
            System.out.println("scissors!");

        }
    }
}