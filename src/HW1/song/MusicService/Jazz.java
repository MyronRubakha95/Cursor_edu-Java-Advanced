package HW1.song.MusicService;

import HW1.song.MusicMain;

public class Jazz extends Thread {
    final MusicMain musicMain;

    public Jazz(MusicMain musicMain) {
        this.musicMain = musicMain;
    }


    @Override
    public void run() {

        musicMain.addMusic("My Heart Belongs To Daddy");
        musicMain.addMusic(" I Threw A Kiss In The Ocean");
        musicMain.addMusic("One For My Baby");
        System.out.println("Jazz : " + musicMain.getList());
    }
}