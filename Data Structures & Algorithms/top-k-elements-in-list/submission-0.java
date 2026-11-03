class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int[] ans = new int[k];
       int o = 0;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int ele:nums){
           map.put(ele,map.getOrDefault(ele,0)+1);
       }
       List<int[]> arr = new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        arr.add(new int[] {entry.getValue(),entry.getKey()});
       }
       arr.sort((a,b) -> b[0] - a[0]);
       for(int i = 0;i<k;i++){
        ans[i] = arr.get(i)[1];
       }
       return ans;
    }
}
