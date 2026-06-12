import java.util.*;

class Solution {

    public boolean uniqueOccurrences(int[] arr) {

        int[] freq = new int[2001];

        for (int num : arr) {
            freq[num + 1000]++;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int count : freq) {
            if (count == 0)
                continue;

            if (set.contains(count))
                return false;

            set.add(count);
        }

        return true;
    }
}