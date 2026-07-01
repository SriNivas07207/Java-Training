package Day6;

public class HighestMark {
    public static void main(String args[]) {

        int marks[] = {10,20,30,40,50};
        int highest = marks[0];

        for(int i=1; i<marks.length; i++) {
            if(marks[i] > highest) {
                highest = marks[i];
            }
        }

        System.out.println("Highest Mark: " + highest);
    }
}
