import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void pickUp(Person passengers) {
        if ( this.passengerCount() < this.capacity )
        this.passengers.add(passengers);
    }

    public Person removePassenger() {
        return this.passengers.remove(0);
    }

    public void pickUpFromStop(BusStop busStop) {
        Person queue = busStop.removeWaiting();
        this.pickUp(passengers);
}
