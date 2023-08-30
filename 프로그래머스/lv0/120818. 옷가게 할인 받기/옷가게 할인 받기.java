class Solution {
    public int solution(int price) {
        int answer = 0;
        double db = 0;
        if(price>=500000){
            db = price*0.8;
        answer = (int)db;
        }else if(price>=300000){
            db = price*0.9;
        answer = (int)db;
        }else if(price>=100000){
            db = price*0.95;
        answer = (int)db;
        }else {
        answer = price;
        }
        
        return answer;
    }
}