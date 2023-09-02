class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp1 = x;
        int temp2 = 0;
        while(temp1>0){
            temp2 = temp2 + temp1%10;
            temp1 = temp1/10;
        }
        if(x%temp2==0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}