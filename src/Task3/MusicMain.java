package Task3;

import java.util.LinkedList;
import java.util.List;

public class MusicMain {

    private final List<String> list = new LinkedList<>();

    public synchronized void addMusic(String song) {
        list.add(song);
    }

    public List<String> getList() {
        return list;
    }
}
