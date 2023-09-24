import java.util.Arrays;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int[] templ = new int[2];
        int[] tempr = new int[2];
        templ[0] = 100;
        templ[1] = 100;
        tempr[0] = 0;
        tempr[1] = 0;
        
        for(int i=0; i<wallpaper.length; i++){
            String s = wallpaper[i];
            if(s.contains("#")){
                char[] temp = s.toCharArray();
                for(int j=0; j<temp.length; j++){
                    if(temp[j]=='#'){
                        templ[0]=(i<templ[0])? i:templ[0];
                        templ[1]=(j<templ[1])? j:templ[1];
                        tempr[0]=(i>tempr[0])? i:tempr[0];
                        tempr[1]=(j>tempr[1])? j:tempr[1];
                }
               }
        }
        }
        answer[0]=templ[0];
        answer[1]=templ[1];
        answer[2]=tempr[0]+1;
        answer[3]=tempr[1]+1;
        return answer;
    }
}