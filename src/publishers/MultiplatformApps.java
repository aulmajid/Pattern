package publishers;

import subscribers.Device;

import java.util.List;

/**
 * Created by Majid on 07-Apr-17.
 */
public abstract class MultiplatformApps {

    List<Device> devices;

    public void subscribe(Device device){
        devices.add(device);
    }

    public void unsubscribe(Device device){
        devices.remove(device);
    }

    public void sendNotification(String notification){
        for(Device device:devices){
            device.receiveNotification(notification);
        }
    }

}
