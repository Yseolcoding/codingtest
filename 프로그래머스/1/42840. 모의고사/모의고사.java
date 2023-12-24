class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first = new int[]{1,2,3,4,5};
        int[] second = new int[]{2,1,2,3,2,4,2,5};
        int[] third = new int[]{3,3,1,1,2,2,4,4,5,5};
        int fst = 0;
        int sec = 0;
        int trd = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==first[i%5]) fst++;
            if(answers[i]==second[i%8]) sec++;
            if(answers[i]==third[i%10]) trd++;
        }
        
        if((fst==sec)&&(sec==trd)){
            answer = new int[]{1,2,3};
        }else if((fst==sec)&&(sec>trd)){
            answer = new int[]{1,2};
        }else if((fst==trd)&&(trd>sec)){
            answer = new int[]{1,3};
        }else if((sec==trd)&&(trd>fst)){
            answer = new int[]{2,3};
        }else if((fst>sec)&&(fst>trd)){
            answer = new int[]{1};
        }else if((sec>fst)&&(sec>trd)){
            answer = new int[]{2};
        }else {
            answer = new int[]{3};
        }
        
        return answer;
    }
}