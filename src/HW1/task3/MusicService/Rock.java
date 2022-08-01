package HW1.task3.MusicService;

import HW1.task3.MusicMain;

public class Rock extends Thread {
    final MusicMain musicMain;

    public Rock(MusicMain musicMain) {
        this.musicMain = musicMain;
    }

    @Override
    public void run() {

        musicMain.addMusic(	"Like a Rolling Stone");
        musicMain.addMusic("Imagine");
        musicMain.addMusic("What's Going On");
        System.out.println("Rock : " + musicMain.getList());
    }
}