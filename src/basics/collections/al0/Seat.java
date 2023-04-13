package basics.collections.al0;
public class Seat implements Comparable<Seat>{
    private final String seatNumber;
    private boolean reserved = false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        // < 0 = 0 & 0
        //s1>s2 positive
        //s1<s2 negative
        // si == s2 zero
    }

    public boolean reserve(){
        if(!this.reserved){
            this.reserved = true;
            System.out.println("Seat" + seatNumber + " reserved ");
            return true;
        } else {
            return false;
        }
    }

    public boolean cancel(){
        if(this.reserved){
            this.reserved = false;
            System.out.println(seatNumber+"cancelled");
            return true;
        } else  {
            return false;
        }
    }

    public String getSeatNumber(){
        return seatNumber;
    }
}