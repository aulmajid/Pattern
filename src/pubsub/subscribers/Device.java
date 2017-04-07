package pubsub.subscribers;

import pubsub.publishers.MultiplatformApps;


public abstract class Device {

    String deviceName;

    public Device() {
        deviceName = getClass().getSimpleName();
    }

    public void receiveNotification(String notification) {
        System.out.println(deviceName + " : " + notification);
    }

    public void install(MultiplatformApps apps) {
        apps.addDevices(this);
    }

    public void uninstall(MultiplatformApps apps) {
        apps.removeDevies(this);
    }

}
