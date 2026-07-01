package Day6;

public class Richestcustomer {
    public static void main(String args[]) {

        int arr[] = {20,5,40,10,8};
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Richest Customer: " + max);
    }
}
