class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        int index = 0;
        if(arr.length<2){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length-1];
            for(int i=1; i<arr.length; i++){
                if(arr[i]<min){
                    min = arr[i];
                    index = i;
                }
            }
            for(int k = 0; k<arr.length; k++){
                if(k<index){
                answer[k]=arr[k];
                }
                else if(k>index){
                    answer[k-1]=arr[k];
                }
            }
        }
        return answer;
    }
}