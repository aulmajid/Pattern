package subscribers;

import java.util.List;

/**
 * Created by Majid on 07-Apr-17.
 */
public abstract class Device {

    public void receiveNotification(String notification){
        System.out.println(this.getClass().toString() + " : " + notification);
    }

}
