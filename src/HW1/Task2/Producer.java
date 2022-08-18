package HW1.Task2;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class Producer extends Thread {

    private final List<String> list;

    public Producer(List<String> pipe) {
        this.list = pipe;
    }

    @Override
    public void run() {
        synchronized (list) {

            list.add("The Fast and the Furious");
            list.add("Last Christmas");
            list.add("Ford vs Ferrari");

            System.out.println("I have this films : " + list);

            try {
                TimeUnit.SECONDS.sleep(2);
                list.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}