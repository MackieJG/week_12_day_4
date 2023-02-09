import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;

    private Bedroom bedroom;
    private ArrayList<Guest> listOfGuests;


    @Before
    public void setUp(){

        listOfGuests = new ArrayList<Guest>();
        Guest guest = new Guest("Jermaine Marquez");
        listOfGuests.add(guest);
        bedroom = new Bedroom(1, listOfGuests, 37, RoomType.SINGLE);
        booking = new Booking(3, bedroom);
    }

    @Test
    public void bookingHasNightsBooked3(){
        assertEquals(3, booking.getNumOfNightsBooked());
    }
}
