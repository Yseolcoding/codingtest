class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int ma = (n>m)?n:m;
        int a = 0;
        int b = 0;
        
        for(int i=ma; i>=1; i--){
            if(n%i==0&&m%i==0){
                a = i;
                break;
            }
            System.out.println(i + " " + a);
        }

        answer[0] = a;
        answer[1] = n*m/a;
        
        return answer;
    }
}