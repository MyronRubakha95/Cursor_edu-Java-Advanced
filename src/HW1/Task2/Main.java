package HW1.Task2;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = new LinkedList<>();

        Producer producer = new Producer(list);
        User user = new User(list);

        producer.start();
        user.start();
    }
}