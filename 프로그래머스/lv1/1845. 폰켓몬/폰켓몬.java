import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        String key;
        int length = nums.length/2;
        HashMap<String,String> pkm = new HashMap<String,String>();
        
        for(int i=0; i<nums.length; i++){
            if(!pkm.containsKey(nums[i])){
                key = Integer.toString(nums[i]);
                pkm.put(key, null);
            }
        }
        
        if(pkm.size()>length){
            answer = length;
        }else{
            answer = pkm.size();
        }
            
        return answer;
    }
}