import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int cnt = 0;
        if((double)(dots[0][1]-dots[1][1])/(double)(dots[0][0]-dots[1][0])==(double)(dots[2][1]-dots[3][1])/(double)(dots[2][0]-dots[3][0]))cnt++;
        if((double)(dots[0][1]-dots[2][1])/(double)(dots[0][0]-dots[2][0])==(double)(dots[1][1]-dots[3][1])/(double)(dots[1][0]-dots[3][0]))cnt++;
        if((double)(dots[0][1]-dots[3][1])/(double)(dots[0][0]-dots[3][0])==(double)(dots[1][1]-dots[1][1])/(double)(dots[2][0]-dots[2][0]))cnt++;
        
        answer = (cnt>0) ? 1 : 0;

        
        return answer;
    }
}