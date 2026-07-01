package Day5;

public class MaxElement {
    public static void main(String args[]) {

        int arr[] = {25,10,5,30,8};

        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println("Maximum = " + max);
    }
}
