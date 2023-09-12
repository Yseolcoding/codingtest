class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxw = 0;
        int maxh = 0;
        
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(sizes[i][0]>maxw){
                maxw = sizes[i][0];
            }
            if(sizes[i][1]>maxh){
                maxh = sizes[i][1];
            }
        }
        answer = maxw*maxh;
        return answer;
    }
}