class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int food = 12000;
        int drink = 2000;
        
        answer = food*n + drink*(k-(n/10));
        
        return answer;
    }
}