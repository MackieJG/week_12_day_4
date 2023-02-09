import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;



    public Bedroom(int capacity, ArrayList<Guest> listOfGuests, int roomNumber, RoomType roomType) {
        super(capacity, listOfGuests);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}
