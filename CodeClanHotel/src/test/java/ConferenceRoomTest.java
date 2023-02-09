import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    private ArrayList<Guest> listOfGuests;

    @Before
    public void setUp(){
        listOfGuests = new ArrayList<Guest>();
        Guest guest = new Guest("Jermaine Marquez");
        listOfGuests.add(guest);
        conferenceRoom = new ConferenceRoom(1, listOfGuests, "Purgatory");
    }

    @Test
    public void itHasName(){
        assertEquals("Purgatory", conferenceRoom.getName());
    }

    @Test
    public void hasNumberOfGuests(){
        assertEquals(1, conferenceRoom.getGuestCount());
    }
}
