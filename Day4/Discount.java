package Day4;

public class Discount {
      public static void main(String args[]) {

        int cost=120;

        if(cost%10==0 || cost%10==5)
            cost=cost-5;

        System.out.println(cost);
    }
}
