class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> map = new HashSet<>();
       for(int n:nums){
        map.add(n);
       }
       int longest = 0;
       for(int num : map){
         if(!map.contains(num-1)){
            int length  = 1;
            while(map.contains(num+length)){
                length++;
            }
            longest = Math.max(longest,length);
         }
       }
       return longest;
       
    }
}
