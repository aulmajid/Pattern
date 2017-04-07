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

    public void subscribe(MultiplatformApps apps) {
        apps.addDevices(this);
    }

    public void unsubscribe(MultiplatformApps apps) {
        apps.removeDevies(this);
    }

}
