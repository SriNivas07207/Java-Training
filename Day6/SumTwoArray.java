package Day6;

public class SumTwoArray {
    public static void main(String args[]) {

        int arr1[] = {10,20,30};
        int arr2[] = {40,50,60};

        int sum[] = new int[arr1.length];

        for(int i=0; i<arr1.length; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum of Two Arrays: ");
        for(int i=0; i<sum.length; i++) {
            System.out.print(sum[i]+" ");
        }
    }
}
