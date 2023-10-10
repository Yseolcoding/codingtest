import java.lang.Math;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom = 0;
        int numer = 0;
        if(denom1==denom2){
            denom = denom1;
            numer = numer1 + numer2;
        }else{
            denom = denom1*denom2;
            numer = numer1*denom2 + numer2*denom1;
        }
        int min = Math.min(denom, numer);
        
        for(int i = min; i>0; i--){
            if(denom%i==0 && numer%i==0){
                denom = denom/i;
                numer = numer/i;
            }
        }
        answer[0] = numer;
        answer[1] = denom;
        return answer;
    }
}