class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int compl = 0;
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
       for(int i = 0;i<nums.length;i++){
         compl = target-nums[i];
         if(map.containsKey(compl) && map.get(compl) != i){
            return new int[] {i,map.get(compl)};
         }
         
       } 
        return new int[0];
    } 
}
