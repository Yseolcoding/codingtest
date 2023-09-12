class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tl = t.length();
        int pl = p.length();
        long pi = Long.parseLong(p);
        long stp = 0;
        
        for(int i=0; i<tl-pl+1; i++){
            String str = t.substring(i, pl+i);
            stp = Long.parseLong(str);
            if(pi>=stp){
                answer++;
            }
        }
        return answer;
    }
}