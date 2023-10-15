import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<String>();
        for(String s : cities){
            s = s.toUpperCase();
            if(cacheSize==0){
                answer += 5;
            }else if(cache.size()<cacheSize&&!cache.contains(s)){
                cache.add(s);
                answer +=5;
            }else if(cache.size()==cacheSize&&!cache.contains(s)){
                cache.removeFirst();
                cache.add(s);
                answer+=5;
            }else if(cache.contains(s)){
                cache.remove(cache.indexOf(s));
                cache.add(s);
                answer+=1;
            }
            //System.out.println("s : " + s + " answer : " + answer);
        }
        
        
        return answer;
    }
}