package main;

import java.util.Scanner;
import student.StudentModule;
import admin.AdminModule;
public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== CAMPUS HELPDESK =====");
            System.out.println("1. Student");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc .nextLine();
            switch (choice) {
                case 1:
                    StudentModule.menu(sc);
                    break;
                
                case 2: 
                	AdminModule.menu();
                	break;
         
                case 3:
                    System.out.println("Bye babe 💙 See you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again 😐");
            }
        }
    }
}
