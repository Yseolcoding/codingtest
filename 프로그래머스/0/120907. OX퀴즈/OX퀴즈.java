class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
        
        String[] result = quiz[i].split(" ");
            
        int ia = Integer.parseInt(result[0]);
        int ib = Integer.parseInt(result[2]);
        int ians = Integer.parseInt(result[4]);
        if(result[1].equals("+")){
            if(ians==(ia+ib)){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }else if(result[1].equals("-")){
            if(ians==(ia-ib)){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        
        }
        return answer;
    }
}