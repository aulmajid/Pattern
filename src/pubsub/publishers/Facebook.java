package pubsub.publishers;


public class Facebook extends MultiplatformApps {

    public void joinGroupNotification(){
        sendNotification("Datin ingin masuk grup");
    }

    public void inviteNotification(){
        sendNotification("Datin meminta pertemanan");
    }
}
