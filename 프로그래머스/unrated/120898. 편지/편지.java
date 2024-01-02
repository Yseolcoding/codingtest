class Solution {
    public int solution(String message) {
        int answer = 0;
        char[] chMessage = message.toCharArray();
        
        for(char a : chMessage){
            answer = answer+2;
        }
        return answer;
    }
}