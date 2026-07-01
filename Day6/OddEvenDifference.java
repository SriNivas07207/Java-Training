package Day6;

public class OddEvenDifference {
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};
        int oddSum = 0;
        int evenSum = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        int difference = Math.abs(oddSum - evenSum);
        System.out.println("Difference between Odd and Even Sum: " + difference);
    }
}
