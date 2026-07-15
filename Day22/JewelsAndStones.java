package Day22;
public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);

            for (int j = 0; j < jewels.length(); j++) {
                if (stone == jewels.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels1, stones1)); // 3

        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println(numJewelsInStones(jewels2, stones2)); // 0
    }
}