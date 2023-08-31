class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String strForward = "";
        String strBack = "";
        String temp ="";
        
        strForward = my_string.substring(0,s);
        System.out.println(strForward);
        temp = strForward+overwrite_string;
        System.out.println(temp);
        strBack = my_string.substring(temp.length());
        System.out.println(strBack);    
        answer = temp+strBack;
        
        return answer;
    }
}