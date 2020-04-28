import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person passengers;

    @Before

    public void before() {
        busStop = new BusStop();
        passengers = new Person();
    }

    @Test

    public void stopHasPeople() {
        assertEquals(0, busStop.waitingCount());
    }

    @Test

    public void canAddWaiting() {
        busStop.addWaiting(passengers);
        assertEquals(1, busStop.waitingCount());
    }

    @Test

    public void canRemoveWaiting() {
        busStop.addWaiting(passengers);
        busStop.removeWaiting(passengers);
        assertEquals(0, busStop.waitingCount());
    }

}
