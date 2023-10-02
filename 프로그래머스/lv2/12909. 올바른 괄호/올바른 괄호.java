class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int temp = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals(")")){
                temp--;
            }else{
                temp++;
            }
            if(temp<0){
                answer = false;
                break;
            }
        }
        if(temp != 0){
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(temp);

        return answer;
    }
}