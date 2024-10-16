/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L07_Queue;

import java.util.Scanner;

/**
 *
 * @author Saliz II
 */
public class Main {
    public static void main(String[] args) {
    Queue customerQueue = new Queue();
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve customer");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    customerQueue.enqueue(new Customer(name));
                    break;

                case "2":
                    customerQueue.dequeue();
                    break;

                case "3":
                    customerQueue.displayQueue();
                    break;

                case "4":
                    System.out.println("Thankyou. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        } while (!option.equals("4"));

        scanner.close();
    }
}