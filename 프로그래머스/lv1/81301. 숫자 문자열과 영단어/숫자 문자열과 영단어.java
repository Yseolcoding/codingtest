class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] num = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<10; i++){
            String temp = Integer.toString(i);
            s = s.replace(num[i], temp);
        }

        answer = Integer.parseInt(s);
        
        return answer;
    }
}