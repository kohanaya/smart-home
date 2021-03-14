package com.company.smartApp;

import com.company.smartDevice.Device;
import com.company.smartDevice.appliances.*;
import com.company.smartDevice.environmental.safety.AlarmCo2;
import com.company.smartDevice.environmental.safety.AlarmSmoke;
import com.company.smartDevice.lighting.Light;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartHomeHub {

    private List<Device> kitchenDevices = new ArrayList<>();

    public SmartHomeHub() {
        kitchenDevices.add(new CoffeeMaker("CoffeeMaker Turbo2000"));
        kitchenDevices.add(new CrockPot("CrockPot 1000"));
        kitchenDevices.add(new Dishwasher("Dishwasher Index"));
        kitchenDevices.add(new Grill("Grill LG"));
        kitchenDevices.add(new Microwave("Microwave LG"));
        kitchenDevices.add(new Refrigerator("Refrigerator GE"));
        kitchenDevices.add(new Stove("Stove Luke"));
        kitchenDevices.add(new AlarmCo2("Kitchen - AlarmCo2 Nest"));
        kitchenDevices.add(new AlarmSmoke("Kitchen - AlarmSmoke Nest"));
        kitchenDevices.add(new Light("Light LED"));
    }

    public void listDevices() {
        for (int i = 0; i < kitchenDevices.size(); i++) {
            Device d = kitchenDevices.get(i);
            System.out.println(i + " - " + d.getDeviceName());
        }
    }

    public void addKitchenDevice() {
        System.out.println("===> What kind of device do you want to add?");
        printSupportedKitchenDevices();
        Scanner input = new Scanner(System.in);
        int actionNum = input.nextInt();
        input.nextLine();
        System.out.print("Enter device name: ");
        String name = input.nextLine();
        switch (actionNum) {
            case 1:
                addKitchenDevice(new CoffeeMaker(name));
                break;
            case 2:
                addKitchenDevice(new CrockPot(name));
                break;
            case 3:
                addKitchenDevice(new Dishwasher(name));
                break;
            case 4:
                addKitchenDevice(new Grill(name));
                break;
            case 5:
                addKitchenDevice(new Microwave(name));
                break;
            case 6:
                addKitchenDevice(new Refrigerator(name));
                break;
            case 7:
                addKitchenDevice(new Stove(name));
                break;
            case 8:
                addKitchenDevice(new AlarmCo2(name));
                break;
            case 9:
                addKitchenDevice(new AlarmSmoke(name));
                break;
            case 10:
                addKitchenDevice(new Light(name));
                break;
            default:
                System.out.println("Unknown device");
        }
    }

    public void removeKitchenDevice() {
        System.out.println("Which device you want to delete?");
        listDevices();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter device number to delete: ");
        int deviceNum = input.nextInt();
        removeKitchenDevice(deviceNum);
    }

    public void addKitchenDevice(Device device) {
        kitchenDevices.add(device);
        System.out.println("===> Device was added!");
    }

    public void removeKitchenDevice(int deviceIndex) {
        if (deviceIndex > kitchenDevices.size()) {
            System.out.println("===> Invalid device number!");
            return;
        }
        kitchenDevices.remove(deviceIndex);
        System.out.println("===> Device was removed!");
    }

    private void printSupportedKitchenDevices() {
        System.out.println("1. CoffeeMaker");
        System.out.println("2. CrockPot");
        System.out.println("3. Dishwasher");
        System.out.println("4. Grill");
        System.out.println("5. Microwave");
        System.out.println("6. Refrigerator");
        System.out.println("7. Stove");
        System.out.println("8. AlarmCo2");
        System.out.println("9. AlarmSmoke");
        System.out.println("10. Light");
    }

}
