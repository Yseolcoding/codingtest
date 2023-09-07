class Solution {
    public String solution(int n) {
        String answer = "";
        int index = 0;
        while(index<n){
            if(index%2==0){
                answer += "수";
                index++;
            }else {
                answer += "박";
                index++;
            }
        }
        return answer;
    }
}