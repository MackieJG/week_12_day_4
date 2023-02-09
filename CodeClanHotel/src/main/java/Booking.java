public class Booking {

    private int numOfNightsBooked;

    Bedroom bedroom;
    public Booking(int numOfNightsBooked, Bedroom bedroom) {
        this.numOfNightsBooked = numOfNightsBooked;
        this.bedroom = bedroom;
    }

    public int getNumOfNightsBooked() {
        return numOfNightsBooked;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setNumOfNightsBooked(int numOfNightsBooked) {
        this.numOfNightsBooked = numOfNightsBooked;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }




}
