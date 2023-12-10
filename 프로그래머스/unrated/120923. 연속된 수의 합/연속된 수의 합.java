class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int mid = total/num;
        int x;
        
        if(num%2==1){
            x = mid-(num/2);
        }else {
            x = mid-(num/2)+1;
        }
            for(int i=0; i<num; i++){
                answer[i] = x;
                x++;
            }
        
        return answer;
    }
}