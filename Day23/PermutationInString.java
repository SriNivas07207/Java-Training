package Day23;

import java.util.Arrays;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Count characters
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(s1Count, windowCount)) {
            return true;
        }

        // Slide the window
        for (int i = s1.length(); i < s2.length(); i++) {
            windowCount[s2.charAt(i) - 'a']++;
            windowCount[s2.charAt(i - s1.length()) - 'a']--;

            if (Arrays.equals(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));

        String s3 = "ab";
        String s4 = "eidboaoo";

        System.out.println(checkInclusion(s3, s4));
    }
}

