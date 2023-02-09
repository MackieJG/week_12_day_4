import java.util.ArrayList;

public abstract class Room {

    private int capacity;

    private ArrayList<Guest> listOfGuests;

    public Room(int capacity, ArrayList<Guest> listOfGuests){
        this.capacity = capacity;
        this.listOfGuests = listOfGuests;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getListOfGuests() {
        return listOfGuests;
    }

    public int getGuestCount(){
        return listOfGuests.size();
    }

    public void addGuest(Guest guest){
        this.listOfGuests.add(guest);

    }

}
