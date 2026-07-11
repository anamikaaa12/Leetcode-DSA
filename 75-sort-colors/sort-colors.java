class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int k=0;
        int j= nums.length-1;
        int temp=0;
        while(k<=j){
            if(nums[k]==1){
k++;
            }
            else if(nums[k]==2){
                 temp= nums[k];
                nums[k]= nums[j];
                nums[j]= temp;
                j--;
            }
            else {
             temp = nums[k];
            nums[k]= nums[i];
            nums[i]= temp;
            i++;
            k++;
        }}
        System.out.println(nums);
    }
}