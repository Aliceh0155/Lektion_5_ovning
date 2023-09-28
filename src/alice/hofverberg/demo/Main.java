package alice.hofverberg.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input player name:");

        String namn = sc.nextLine();
        System.out.println("Player #1: " + namn);

        System.out.println("Mata in ett tal!");

        int tal = sc.nextInt();
        for (int i = 0; i < tal; i++) {

            System.out.println("loopen körs");


        }

        do {

            System.out.println("Hej");

        } while (true);


    }
}