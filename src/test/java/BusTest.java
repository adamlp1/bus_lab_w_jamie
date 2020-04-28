import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passengers;
    private int capacity;

    @Before

    public void before() {
        bus = new Bus("Ocean Terminal", 5);
        passengers = new Person();
    }

    @Test

    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test

    public void canPickUp() {
        bus.pickUp(passengers);
        assertEquals(1, bus.passengerCount());
    }

    @Test

    public void cantPickUp() {
        bus.pickUp(passengers);
        bus.pickUp(passengers);
        bus.pickUp(passengers);
        bus.pickUp(passengers);
        bus.pickUp(passengers);
        bus.pickUp(passengers);
        assertEquals(5, bus.passengerCount());
    }

    @Test

    public void canRemovePassenger() {
        bus.pickUp(passengers);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test

    public void canPickUpFromStop() {
        bus.pickUpFromStop(busStop);
        assertEquals(1, bus.passengerCount());

    }



}
