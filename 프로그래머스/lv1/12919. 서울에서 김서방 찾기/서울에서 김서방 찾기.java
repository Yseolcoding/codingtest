class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int location = 0;
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                location = i;
            }
        }
        
        answer = "김서방은 " + location + "에 있다";
        
        return answer;
    }
}