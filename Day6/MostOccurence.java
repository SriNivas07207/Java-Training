package Day6;

public class MostOccurence {
    public static void main(String args[]) {

        int arr[] = {10,20,10,30,20,10};
        int freq[] = new int[arr.length];
        int visited = -1;

        for(int i=0; i<arr.length; i++) {
            int count = 1;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i] != visited) {
                freq[i] = count;
            }
        }

        int maxFreq = 0;
        int mostOccurElement = 0;

        for(int i=0; i<freq.length; i++) {
            if(freq[i] != visited && freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostOccurElement = arr[i];
            }
        }

        System.out.println("Most Occurring Element: " + mostOccurElement + " with frequency: " + maxFreq);
    }
}
