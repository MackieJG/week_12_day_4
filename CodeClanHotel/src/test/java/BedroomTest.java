import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    private ArrayList<Guest> listOfGuests;

    @Before
    public void setUp(){
        listOfGuests = new ArrayList<Guest>();
        Guest guest = new Guest("Jermaine Marquez");
        Guest guest2 = new Guest("Heather Lane");
        listOfGuests.add(guest);
        listOfGuests.add(guest2);
        bedroom = new Bedroom(1, listOfGuests, 37, RoomType.SINGLE);
    }
    @Test
    public void itHasRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void itHasRoomNumber(){
        assertEquals(37, bedroom.getRoomNumber());
    }
    @Test
    public void hasAGuest(){
        assertEquals(listOfGuests, bedroom.getListOfGuests());
    }
    @Test
    public void hasNumberOfGuests(){
        assertEquals(2, bedroom.getGuestCount());
    }

}
