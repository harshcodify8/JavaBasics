package basics.collections.al0;
public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Apsara",10,5);
        theatre.getSeats();
        if(theatre.reserveSeat("c2")){
            System.out.println("seat not reserved");
        } else {
            System.out.println("Seat reserved");
        }
    }
}
