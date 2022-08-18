package HW1.Task1;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        FireDepartment fireDepartment = new FireDepartment(5);
        fireDepartment.start();

        TimeUnit.SECONDS.sleep(5);

        Victim victim = new Victim(fireDepartment);
        victim.start1();
    }
}