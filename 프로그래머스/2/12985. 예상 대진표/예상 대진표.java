import java.lang.Math;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int round = 0;
        int abRound = 1;
        
        while(n>1){
            n = n/2;
            round++;
        }
        
        for(int i=0; i<round; i++){
            int min = Math.min(a,b);
            if(min%2!=0&&((a-b)==1||(b-a)==1)){
                answer = abRound;
                break;
            }
            if(a%2==1){
                a = a/2 + 1;
            }else{
                a = a/2;
            }
            
            if(b%2==1){
                b = b/2 + 1;
            }else{
                b = b/2;
            }
            abRound++;
            System.out.println("i : "+i+" a : " + a + " b : " + b + " abround : " + abRound);
        }
        answer = abRound;
        return answer;
    }
}