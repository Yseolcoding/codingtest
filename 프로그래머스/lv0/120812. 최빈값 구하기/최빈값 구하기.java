class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max=0;
        int[] frequency = new int[1000];
        for(int i=0;i<array.length;i++){
            frequency[array[i]]++;
        }
        for(int j=0;j<1000;j++){
            if(frequency[j]>max){
                max = frequency[j];
                answer = j;
            }
        }
        for(int k=0;k<1000;k++){
            if(answer!=k&&frequency[k]==max){
                answer = -1;
            }
        }
        return answer;
    }
}