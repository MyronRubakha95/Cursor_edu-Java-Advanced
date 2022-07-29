package HW1.Task3.MusicService;

import HW1.Task3.MusicMain;

public class Classical extends Thread {
    final MusicMain musicMain;

    public Classical(MusicMain musicMain) {
        this.musicMain = musicMain;
    }

    @Override
    public void run() {

        musicMain.addMusic("Die Feen");
        musicMain.addMusic("Das Liebesverbot");
        musicMain.addMusic("Leubald");
        System.out.println("Classical : " + musicMain.getList());
    }
}