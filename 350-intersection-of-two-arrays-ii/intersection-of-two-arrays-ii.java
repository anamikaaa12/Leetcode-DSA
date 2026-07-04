class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: nums1) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
       for(int num: nums2){
        if(map.containsKey(num) && map.get(num)>0){
            map.put(num, map.get(num)-1);
            result.add(num);
        }
       } 
       int ans[]= new int[result.size()];
       for(int i=0; i< result.size(); i++){
       ans[i]= result.get(i);
    }
    return ans;
}
}