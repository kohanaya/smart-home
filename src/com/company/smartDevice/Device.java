package com.company.smartDevice;

public abstract class Device {

    private final String deviceName;
    private boolean isPowerOn;
    private boolean deviceHasPower;
    private String deviceLocation;

    public Device(String name) {
        this.deviceName = name;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public boolean isDeviceHasPower() {
        return deviceHasPower;
    }

    public void setDeviceHasPower(boolean deviceHasPower) {
        this.deviceHasPower = deviceHasPower;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }
}

