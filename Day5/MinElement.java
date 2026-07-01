package Day5;

public class MinElement {
    public static void main(String args[]) {

        int arr[] = {25,10,5,30,8};

        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Minimum = " + min);
    }
}
