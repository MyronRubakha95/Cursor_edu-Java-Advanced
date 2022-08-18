package HW1.Task1;

public class FireFighter extends Thread {

    private final FireDepartment fireDepartment;
    public final String name;


    public FireFighter(FireDepartment fireDepartment, String name) {
        this.fireDepartment = fireDepartment;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (fireDepartment) {
            System.out.println("Firefighter " + name + " is ready");
            try {
                fireDepartment.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Firefighter " + name + " received a call");
        }
    }
}