package HW1.Task1;

import java.util.ArrayList;
import java.util.List;


public class FireDepartment {

    public final List<FireFighter> fireFighters;

    public FireDepartment(int work) {
        List<FireFighter> list = new ArrayList<>(work);
        for (int i = 0; i < work; i++) {
            list.add(new FireFighter(this, "Adam" + i));
        }
        fireFighters = list;
    }
    public void start() {
        for (FireFighter fireFighter : fireFighters) {
            fireFighter.start();
        }
    }
}