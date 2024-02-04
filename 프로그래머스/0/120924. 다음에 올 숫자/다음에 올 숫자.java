class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        //등차인지 확인하는 조건문
        if(common[1]-common[0]==common[2]-common[1]){
            answer = common[common.length-1] + common[1]-common[0];
        }else{
            int a = common[2]-common[1];
            int b = common[1]-common[0];
            answer = common[common.length-1] * (a/b);
        }
        
        return answer;
    }
}