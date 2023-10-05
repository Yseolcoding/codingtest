class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int by = brown + yellow;
        
        for(int i=3; i<=by/2; i++){
            if(by%i==0){
                int garo = by/i;
                int sero = i;
                if(((garo+sero)*2-4)==(brown)){
                    answer[0] = garo;
                    answer[1] = sero;
                    break;
                }
            }
        }        
        
        return answer;
    }
}