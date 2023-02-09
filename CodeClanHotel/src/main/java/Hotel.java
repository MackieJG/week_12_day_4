import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> listOfRooms;

    private ArrayList<ConferenceRoom> listOfConferenceRooms;

    public Hotel(ArrayList<Bedroom> listOfRooms, ArrayList<ConferenceRoom> listOfConferenceRooms) {
        this.listOfRooms = listOfRooms;
        this.listOfConferenceRooms = listOfConferenceRooms;
    }

    public ArrayList<Bedroom> getListOfRooms() {
        return listOfRooms;
    }

    public ArrayList<ConferenceRoom> getListOfConferenceRooms() {
        return listOfConferenceRooms;
    }

    public void checkIn(Guest guest, Bedroom bedroom){
        bedroom.addGuest(guest);
    }
    public Booking bookRoom(int numOfNightsBooked, Bedroom bedroom){
        Booking booking = new Booking(numOfNightsBooked, bedroom);
        booking.setBedroom(bedroom);
        booking.setNumOfNightsBooked(numOfNightsBooked);
        return booking;
    }
}

