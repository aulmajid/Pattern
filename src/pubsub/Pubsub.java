package pubsub;

import pubsub.publishers.*;
import pubsub.subscribers.Pc;
import pubsub.subscribers.Phone;
import pubsub.subscribers.Tablet;
import pubsub.subscribers.Tv;


public class Pubsub {

    public static void main(String[] args) {

        // Apps
        Calendar calendar = new Calendar();
        Facebook facebook = new Facebook();
        Gmail gmail = new Gmail();
        MangaReader mangaReader = new MangaReader();
        Steam steam = new Steam();

        // Devies
        Pc pc = new Pc();
        Phone phone = new Phone();
        Tablet tablet = new Tablet();
        Tv tv = new Tv();

        // fb
        phone.install(facebook);
        pc.install(facebook);
        tv.install(facebook);
        tablet.install(facebook);

        // calendar
        tv.install(calendar);
        phone.install(calendar);

        // gmail
        pc.install(gmail);
        phone.install(gmail);
        tablet.install(gmail);

        // manga
        pc.install(mangaReader);
        tablet.install(mangaReader);

        // steam
        pc.install(steam);
        tv.install(steam);

        // notifiation
        facebook.sendNotification("Datin mengirim lampiran");
        gmail.sendNotification("3 pesan baru");
        steam.sendNotification("Saatnya khilaf, Summer sale dimulai");
        calendar.sendNotification("Deadline APL!!!!");
        mangaReader.sendNotification("New update : Attack on Titan 93");

        // test
        facebook.joinGroupNotification();
        tv.uninstall(facebook);
        pc.uninstall(facebook);
        facebook.inviteNotification();
    }

}
