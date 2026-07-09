class Solution {
    boolean isPalindrome(int i, int j, String s){
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0;
        int j= s.length()-1;
        while(i< j){
            char left= s.charAt(i),
            right= s.charAt(j);
            if(left!=right){
                return isPalindrome(i+1, j, s)|| isPalindrome(i,j-1, s);
            }
            i++;
            j--;
        }
        return true;
    }
}