import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                temp.add(arr[i]);
            }
        }
        
        if(temp.size()==0){
            answer = new int[]{-1};
        }else{
            int index=0;
            answer = new int[temp.size()];
            for(int j : temp){
                answer[index] = j;
                index++;
            }
            Arrays.sort(answer);
        }
        
        
        return answer;
    }
}