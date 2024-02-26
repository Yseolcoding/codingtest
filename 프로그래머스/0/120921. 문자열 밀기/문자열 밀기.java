class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] ch = new char[A.length()];
        String s = A;
        if(A.equals(B)){
        }else{
            for(int j=0; j<A.length(); j++){
                s = changeOrder(s);
                if(s.equals(B)){
                    answer = j+1;
                    break;
                } else {
                    answer = -1;
                }
            }
        }
        return answer;
    }
    
    public String changeOrder(String s){
        String temp = "";
        temp += s.charAt(s.length()-1);
        for(int i=0; i<s.length()-1; i++){
            temp += s.charAt(i);
        }
        System.out.println(temp);
        
        return temp;
    }
}