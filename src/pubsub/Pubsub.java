package pubsub;

import pubsub.publishers.Facebook;
import pubsub.subscribers.Phone;


public class Pubsub {

    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        Phone phone = new Phone();

        phone.subscribe(facebook);
        facebook.sendNotification("Hai");

        facebook.printDevices();
    }

}
