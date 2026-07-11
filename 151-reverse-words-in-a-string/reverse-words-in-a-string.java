class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                i++;
            } else {
                break;
            }
        }

        while (j >= 0) {
            if (s.charAt(j) == ' ') {
                j--;
            } else {
                break;
            }
        }

        StringBuilder sB = new StringBuilder();

        while (i <= j) {
            if (s.charAt(i) != ' ') {
                sB.append(s.charAt(i));      // Fixed
                i++;
            } else {
                if (sB.length() > 0 && sB.charAt(sB.length() - 1) != ' ') {   // Fixed
                    sB.append(" ");
                }
                i++;
            }
        }

        int l = 0;
        int r = sB.length() - 1;

        while (l < r) {
            char temp = sB.charAt(l);            // char, not int
            sB.setCharAt(l, sB.charAt(r));       // Fixed method name
            sB.setCharAt(r, temp);               // r, not j
            l++;
            r--;                                // Fixed
        }

        int start = 0;
        int end = 0;

        while (start < sB.length()) {

            while (end < sB.length() && sB.charAt(end) != ' ') {
                end++;
            }

            int p1 = start;
            int p2 = end - 1;

            while (p1 < p2) {
                char temp = sB.charAt(p1);
                sB.setCharAt(p1, sB.charAt(p2));   // Fixed
                sB.setCharAt(p2, temp);            // Fixed
                p1++;
                p2--;
            }

            start = end + 1;
            end = start;
        }

        return sB.toString();
    }
}