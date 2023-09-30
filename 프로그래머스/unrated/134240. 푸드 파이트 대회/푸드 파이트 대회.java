class Solution {
    public String solution(int[] food) {
        String answer = "";
    
        for(int i=1; i<food.length; i++){
            int temp = food[i]/2;
            if(temp>0){
            for(int j=0; j<temp; j++){
                answer = answer + i;
            }
            System.out.println(answer);
            }
        }
        answer += 0;
        
        for(int k=food.length-1; k>0; k--){
            int temp = food[k]/2;
            if(temp>0){
            for(int j=0; j<temp; j++){
                answer = answer + k;
            }
            System.out.println(answer);
            }
        }
        
        
        return answer;
    }
}