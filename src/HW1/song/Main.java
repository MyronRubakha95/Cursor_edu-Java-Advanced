package HW1.song;
import HW1.song.MusicService.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MusicMain musicMain = new MusicMain();
        Pop pop = new Pop(musicMain);
        TimeUnit.SECONDS.sleep(3);
        Jazz jazz = new Jazz(musicMain);
        TimeUnit.SECONDS.sleep(3);
        Rock rock = new Rock(musicMain);
        TimeUnit.SECONDS.sleep(3);
        Techno techno = new Techno(musicMain);
        TimeUnit.SECONDS.sleep(3);
        Classical classical = new Classical(musicMain);
        TimeUnit.SECONDS.sleep(3);
        pop.start();
        jazz.start();
        rock.start();
        techno.start();
        classical.start();

    }
}
