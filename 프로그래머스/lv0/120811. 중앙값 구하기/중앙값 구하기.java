class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                if(array[j]<array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i : array){
            System.out.print(i + " ");
        }
        answer = array[array.length/2];
        return answer;
    }
}