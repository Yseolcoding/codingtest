import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<String>();
        for(String s : cities){
            //도시명 대문자로 바꿔주기
            s = s.toUpperCase();
            //CacheSize가 0이어서 Hit가 되지 않는 경우
            if(cacheSize==0){
                answer += 5;
            //cache가 비어있거나 공간이 남은 경우
            }else if(cache.size()<cacheSize&&!cache.contains(s)){
                cache.add(s);
                answer +=5;
            //cache의 크기만큼 도시가 들어가 있으나 Hit가 되지 않은 경우
            }else if(cache.size()==cacheSize&&!cache.contains(s)){
                cache.removeFirst();
                cache.add(s);
                answer+=5;
            //cache가 포함한 값과 hit 가 된 경우
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
