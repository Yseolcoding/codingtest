class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char[] cCode = code.toCharArray();
        
        for(int i=0; i<code.length(); i++){
            if(cCode[i]=='1'){
                mode = (mode==0)? 1 : 0;
                continue;
            }
            if(mode==0){
                if(i%2==0){
                    answer += cCode[i];
                }
            } else if(mode==1){
                if(i%2==1){
                    answer += cCode[i];
                }
            }
        }
        if(answer==""){
            answer = "EMPTY";
        }
        
        return answer;
    }
}