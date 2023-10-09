import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int min = 0;
        int plength = people.length;
        int max = plength-1;
        
        while(min<max){
            if(limit>=people[max]+people[min]){
                answer++;
                max--;
                min++;
            }else{
                answer++;
                max--;
                plength--;
            }
        }
        if(plength%2!=0){
            answer++;
        }
        return answer;
    }
}