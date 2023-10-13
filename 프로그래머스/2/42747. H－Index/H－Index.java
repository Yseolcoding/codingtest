import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        int hi = 0;
        int n = 0;
        Arrays.sort(citations);
        
        for(int i=0; i<length; i++){
            hi = length - i;
            if(citations[i]>=hi){
                answer = hi;
                break;
            }
        }
        return answer;
    }
}