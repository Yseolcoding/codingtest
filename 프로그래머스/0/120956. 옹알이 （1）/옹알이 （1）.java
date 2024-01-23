class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int length = 0;
        String[] Ong = new String[]{ "aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            length = babbling[i].length();
            System.out.println(length);
            
            if(babbling[i].contains("aya")) length = length-3;
            if(babbling[i].contains("ye")) length = length-2;
            if(babbling[i].contains("woo")) length = length-3;
            if(babbling[i].contains("ma")) length = length-2;
            System.out.println(length);
            
            if(length==0) answer++;
        }
        
        return answer;
    }
}