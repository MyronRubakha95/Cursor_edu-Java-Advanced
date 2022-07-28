package Task3.MusicService;

import Task3.MusicMain;


public class Pop extends Thread {

    final MusicMain musicMain;

    public Pop(MusicMain musicMain) {

        this.musicMain = musicMain;
    }

    @Override
    public void run() {

        musicMain.addMusic("Dancing Queen");
        musicMain.addMusic("Eagle");
        musicMain.addMusic("Fernando");
        System.out.println("Pop : " + musicMain.getList());
    }
}





