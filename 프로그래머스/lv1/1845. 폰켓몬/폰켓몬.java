import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length/2;
        HashMap<Integer,Integer> pkm = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(!pkm.containsKey(nums[i])){
                pkm.put(nums[i], null);
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