/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic3_stack;
import java.util.Scanner;
/**
 *
 * @author Jane Justine
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Stack stack = new Stack(5);

        while (true) {
            System.out.println("Choose what you want to do:");
            System.out.println("1. Check stack size");
            System.out.println("2. Push a number");
            System.out.println("3. Peek the top element");
            System.out.println("4. Pop the top element");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Stack size is: " + stack.size());
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    if (stack.isFull()) {
                        System.out.println("Stack is full. Cannot push more numbers.");
                    } else {
                        System.out.println("Enter a number to push: ");
                        int num = sc.nextInt();
                        stack.push(num);
                        System.out.println("Pushed value: " + num);
                        System.out.println("Stack size is now: " + stack.size());
                    }
                    System.out.println("----------------------------------");
                    break;
                case 3:
                    int peeked = stack.peek();
                    if (peeked != -1) {
                        System.out.println("Top element is: " + peeked);
                    }
                    System.out.println("----------------------------------");
                    break;
                case 4:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                        System.out.println("Stack size is now: " + stack.size());
                    }
                    System.out.println("----------------------------------");
                    break;
                case 5:
                    System.out.println("Thank you, bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("-----------------------------------");
            }
        }
    }
}   