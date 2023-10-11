import java.lang.Math;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int round = 0;
        int abRound = 1;
        
        // 라운드 최대 진행횟수 구하기
        while(n>1){
            n = n/2;
            round++;
        }
        
        // 라운드 진행
        for(int i=0; i<round; i++){
            
            // 같은조가 아닌 옆조로 배정됐을때, 종료를 막기 위한 조건에 필요.
            int min = Math.min(a,b);
            
            //같은조에 배정되었을 때, 반복문 종료 조건 (ex : 1,2 or 3,4)
            if(min%2!=0&&((a-b)==1||(b-a)==1)){
                answer = abRound;
                break;
            }
            
            //승리했을 때 다음라운드로 진출시 바뀌는 번호 배정
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
        }
        answer = abRound;
        return answer;
    }
}