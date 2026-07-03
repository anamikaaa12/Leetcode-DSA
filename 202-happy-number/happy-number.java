class Solution {
    public int SumOfSquares(int n)
    {
        int sum=0;
        while(n>0)
        {
          int  d=n%10;
            n=n/10;
            sum= sum + (d*d);
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> set= new HashSet<>();
        while(n!=1)
{
    if(set.contains(n))
    {
    return false;
    }
    set.add(n);
        n= SumOfSquares(n);
    }
    return true;
}
}