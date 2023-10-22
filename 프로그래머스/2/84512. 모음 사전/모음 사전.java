class Solution {
        char[] vowel = new char[]{'A', 'E', 'I', 'O', 'U'};
        int[] pow = new int[]{781, 156, 31, 6, 1};
    
    public int solution(String word) {
        int answer = 0;
        int length = word.length();
        char[] words = new char[length];
        
        for(int i=0; i<length; i++){
            words[i] = word.charAt(i);
        }
        
        for(int j=0; j<length; j++){
            answer += indexing(words[j], j);
        }
        
        
        return answer;
    }
    
    public int indexing(char c, int index){
        int temp = 0;
        if(c==vowel[0]){
            temp++;
        }else if(c == vowel[1]){
            temp = pow[index]*1+1;
        }else if(c == vowel[2]){
            temp = pow[index]*2+1;
        }else if(c == vowel[3]){
            temp = pow[index]*3+1;
        }else if(c == vowel[4]){
            temp = pow[index]*4+1;
        }
        
        return temp;
    }
}