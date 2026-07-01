package Day4;

public class BusSeats {
    public static void main(String args[]) {

        int total=50;
        int booked=35;

        if(booked<=total)
            System.out.println("Remaining = "+(total-booked));
        else
            System.out.println("Invalid Booking");
    }
}
