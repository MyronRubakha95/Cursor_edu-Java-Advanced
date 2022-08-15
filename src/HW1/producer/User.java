package HW1.producer;


import java.util.List;

public class User extends Thread {

    private final List<String> list;

    public User(List<String> pipe) {
        this.list = pipe;
    }

    @Override
    public void run() {
        synchronized (list) {

            System.out.println("It's my favourite films : " + list);
            try {

                list.notifyAll();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


