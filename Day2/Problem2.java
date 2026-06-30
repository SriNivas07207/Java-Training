package Day2;

public class Problem2 {
    public static void main(String args[]) {
        int arr[] = {10, 45, 23, 67, 12};

        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Smallest = " + min);
    }
}
