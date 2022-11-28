package ie.atu;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        System.out.println("Please enter Name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("you entered :" + name);

        System.out.println("Please enter address");
        String address = input.nextLine();
        System.out.println("you entered :" + address);

        System.out.println("Please enter your phone number");
        String number = input.nextLine();
        System.out.println("you entered :" + number);
    }

}
