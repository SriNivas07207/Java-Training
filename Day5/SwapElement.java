package Day5;

public class SwapElement {
    public static void main(String args[]) {

        int arr[] = {10,20,30,40};

        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        for(int n : arr)
            System.out.print(n+" ");
    }

}
