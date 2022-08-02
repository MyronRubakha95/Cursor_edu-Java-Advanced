package HW1.song.MusicService;

import HW1.song.MusicMain;

public class Techno extends Thread {
    final MusicMain musicMain;

    public Techno(MusicMain musicMain) {
        this.musicMain = musicMain;
    }

    @Override
    public void run() {

        musicMain.addMusic("Gravity");
        musicMain.addMusic("Puzzle");
        musicMain.addMusic("That Night");
        System.out.println("Techno : " + musicMain.getList());
    }
}