package topic_3_stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack st = new Stack(5);

        while (true) {
            System.out.println("================");
            System.out.println("Choose number you want to perform"
                    + "\n1. Stack size"
                    + "\n2. Push number"
                    + "\n3. Peek top Element"
                    + "\n4. Pop top Element"
                    + "\n5. Exit");
            System.out.println("================");

            //using try catch to catch invalid input and try again
            try {

                System.out.print("Response: ");

                int choice = sc.nextInt();
                System.out.println();

                switch (choice) {

                    //to know the stack size
                    case 1:
                        System.out.println("The stack size is: " + st.size());
                        break;
                    //push a number to the top of the stack     
                    case 2:
                        if (st.size() != 5) {
                            System.out.println("The stack is not full yet. You can still push!");
                            int num = sc.nextInt();
                            st.push(num);
                        } else if (st.isFull()) {
                            System.out.println("The stack is Full!");
                        }
                        break;
                    //to display the top Element from the stack
                    case 3:
                        System.out.println("The top Element is: " + st.peek());
                        break;
                    //to pop an Element from the stack
                    case 4:
                        System.out.println("Would you like to pop the top Element from the stack?"
                                + "\nPress 1 if YES"
                                + "\nPress any numbers if NO");

                        int resp = sc.nextInt();
                        if (resp == 1) {
                            System.out.println("Popped Element: " + st.pop());
                        }
                        break;
                    //Exit
                    case 5:
                        System.out.println("Thank you for running this simple program. Comeback Again!");
                        sc.close();
                        break;
                    //repeat if invalid input
                    default:
                        System.out.println("Input is invalid. Please choose Again!");

                }
            } catch (Exception e) {
                System.out.println("Input is not a valid. Please try again!");
                sc.next();
            }
        }

    }

}