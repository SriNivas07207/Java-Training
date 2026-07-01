package Day6;

public class TotalBill {
    public static void main(String args[]) {

        int price[] = {100,200,300,400,500};
        int quantity[] = {1,2,3,4,5};

        int totalBill = 0;

        for(int i=0; i<price.length; i++) {
            totalBill += price[i] * quantity[i];
        }

        System.out.println("Total Bill: " + totalBill);
    }
}
