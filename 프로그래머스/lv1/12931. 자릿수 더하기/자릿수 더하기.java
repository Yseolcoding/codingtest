import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nums = n+"";
        int num = nums.length();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(num);
            
        for(int i=0;i<num;i++){
            int k = n%10;
            answer += k;
            n = n/10;
        System.out.println(n);
        System.out.println(k);
        }


        return answer;
    }
}