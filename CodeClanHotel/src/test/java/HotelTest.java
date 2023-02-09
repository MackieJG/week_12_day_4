import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private ArrayList<Bedroom> listOfBedrooms;
    private ArrayList<ConferenceRoom> listOfConferenceRooms;

    private Bedroom bedroom;

    private ConferenceRoom conferenceRoom;

    private ArrayList<Guest> listOfGuests;


   @Before
    public void setUp(){
       listOfConferenceRooms = new ArrayList<ConferenceRoom>();
       listOfBedrooms = new ArrayList<Bedroom>();
       listOfGuests = new ArrayList<Guest>();

       hotel = new Hotel(listOfBedrooms, listOfConferenceRooms);
       bedroom = new Bedroom(1, listOfGuests, 37, RoomType.SINGLE);
       conferenceRoom = new ConferenceRoom(1, listOfGuests, "Purgatory");
   }
   @Test
    public void beAbleToCheckInGuest(){
       Guest guest = new Guest("Jermaine Marquez");
       hotel.checkIn(guest, bedroom);
       assertEquals(1, bedroom.getGuestCount());
   }

   @Test
    public void canBookRoom(){
       Booking booking = new Booking(3, bedroom);
       assertEquals(3, booking.getNumOfNightsBooked());
   }
   }


