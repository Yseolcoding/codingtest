class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String strForward = "";
        String strBack = "";
        String temp ="";
        
        strForward = my_string.substring(0,s);
        temp = strForward+overwrite_string;
        strBack = my_string.substring(temp.length());
        answer = temp+strBack;
        
        return answer;
    }
}
