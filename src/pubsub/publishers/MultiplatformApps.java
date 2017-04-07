package pubsub.publishers;

import pubsub.subscribers.Device;

import java.util.ArrayList;
import java.util.List;


public abstract class MultiplatformApps {

    String appName;
    List<Device> devices;

    public MultiplatformApps() {
        appName = getClass().getSimpleName();
        devices = new ArrayList<Device>();
    }

    public void addDevices(Device device) {
        devices.add(device);
    }

    public void removeDevies(Device device) {
        devices.remove(device);
    }

    public void sendNotification(String message) {
        System.out.println();
        System.out.println(appName + " : " + message);
        for (Device device : devices) {
            device.receiveNotification("(" + appName + ") " + message);
        }
    }

    public void printDevices() {
        System.out.println();
        System.out.println(appName + " registered device(s) : ");
        for (Device device : devices) {
            System.out.println(device.getClass().getSimpleName());
        }
    }
}
