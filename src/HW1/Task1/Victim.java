package Task1;


public class Victim {

    public final FireDepartment fireDepartment;

    public Victim(FireDepartment fireDepartment) {
        this.fireDepartment = fireDepartment;
    }

    public void start1() {
        synchronized (fireDepartment) {
            fireDepartment.notifyAll();
        }
    }
}








