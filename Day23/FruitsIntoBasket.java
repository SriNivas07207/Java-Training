package Day23;

import java.util.HashMap;

public class FruitsIntoBasket {
     public static int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }

    public static void main(String[] args) {

        int[] fruits1 = {1, 2, 1};
        System.out.println(totalFruit(fruits1));

        int[] fruits2 = {0, 1, 2, 2};
        System.out.println(totalFruit(fruits2));

        int[] fruits3 = {1, 2, 3, 2, 2};
        System.out.println(totalFruit(fruits3));
    }
}

