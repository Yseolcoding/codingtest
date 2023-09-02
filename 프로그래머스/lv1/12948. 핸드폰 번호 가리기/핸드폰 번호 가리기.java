class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int pn = phone_number.length();
        
        for(int i = 0; i<pn-4; i++){
            answer += "*";
        }
        
        answer = answer+ phone_number.substring(pn-4,pn);
        return answer;
    }
}