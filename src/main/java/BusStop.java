import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;

    public BusStop() {
        this.queue = new ArrayList<Person>();
    }

    public int waitingCount() {
       return this.queue.size();
    }

    public void addWaiting(Person passengers) {
        this.queue.add(passengers);
    }

    public Person removeWaiting(Person passengers) {
        return this.queue.remove(0);
    }
}
