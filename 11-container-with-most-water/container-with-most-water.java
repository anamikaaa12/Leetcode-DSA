class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int max = 0, right = height.length - 1;
        while (left < right) {
  int h = Math.min(height[left], height[right]);
  int w= right-left;
  int area=  h*w;
            if (area > max){
                max = area;
            }
            if (height[left] < height[right]){
                left++;
            }
            else
                {
                    right--;
                }
        }
        return max;
    }
}