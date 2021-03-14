package com.company.smartApp;

import java.util.Scanner;

public class SmartApp {

    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();
        System.out.println("Welcome to the Smart Home Application");

        app:
        while (true) {
            System.out.println("====> What would you like to do?");
            System.out.println("1. List smart devices");
            System.out.println("2. Enable smart device");
            System.out.println("3. Disable smart device");
            System.out.println("4. Add smart device");
            System.out.println("5. Remove smart device");
            System.out.println("6. Exit");
            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
            int actionNum = input.nextInt();
            switch (actionNum) {
                case 1:
                    System.out.println("List smart devices");
                    hub.listDevices();
                    break;
                case 2:
                    System.out.println("Enable smart device");
                    break;
                case 3:
                    System.out.println("Disable smart device");
                    break;
                case 4:
                    System.out.println("Add kitchen smart device");
                    hub.addKitchenDevice();
                    break;
                case 5:
                    System.out.println("Remove smart device");
                    hub.removeKitchenDevice();
                    break;
                case 6:
                    System.out.println("Bye!");
                    break app;
                default:
                    System.out.println("Please, choose from select options.");
            }
            System.out.print("\n\n\n");
        }
    }

}
