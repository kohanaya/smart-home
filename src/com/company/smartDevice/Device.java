package com.company.smartDevice;

public abstract class Device {

    private final String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

