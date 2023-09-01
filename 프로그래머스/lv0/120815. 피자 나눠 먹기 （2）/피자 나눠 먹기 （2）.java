class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;
        int pizzaslice = 6;
        
        while(pizzaslice%n != 0){
            pizza++;
            pizzaslice = pizza*6;
            System.out.println(pizza);
        }
        
        answer = pizza;
        
        return answer;
    }
}