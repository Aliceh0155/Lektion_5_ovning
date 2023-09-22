package alice.hofverberg.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input player name:");

        String namn = sc.nextLine();
        System.out.println("Player #1: " + namn);

    }
}
