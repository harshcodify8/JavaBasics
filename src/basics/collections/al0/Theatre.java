package basics.collections.al0;

import java.util.ArrayList;
import java.util.*;

public class Theatre {
    private final String theatreName;

     private List<Seat> seats = new ArrayList<>();
    //private List<Seat> seats = new LinkedList<>();
    //private Collection<Seat> seats = new HashSet<>();'
    // any of the collectionn class to hold on that seat
    // private Collection<Seat> seats = new LinkedHashSet<>();
    // any of the collection class to hold that list



    public Theatre(String theatreName , int numRows , int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1 );
        // " 65 + (7-1) = 65 + 8 = 72 = H "
        for(char row = 'A' ; row <= lastRow ; row++ ){
            for(int seatNum = 1 ; seatNum <=seatsPerRow;seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }
    public String getTheatreName(){
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat=seat;
                break;
            }
        }
        if(requestedSeat==null){
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }

    // yoo
    public void getSeats(){
        for(Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }
}
