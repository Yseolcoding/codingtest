class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] temp = new int[n];
        
        for(int i=0; i<n; i++){
            temp[i] = 1;
        }
        for(int j=0; j<lost.length; j++){
            temp[(lost[j]-1)]--;
        }
        for(int k=0; k<reserve.length; k++){
            temp[(reserve[k]-1)]++;
        }
        for(int l=0; l<n; l++){
            if(l==0){
                if(temp[l]==0&&temp[l+1]>1){
                    temp[l]++;
                    temp[l+1]--;
                }
            }else if(l==(n-1)){
                if(temp[l]==0&&temp[l-1]>1){
                    temp[l]++;
                    temp[l-1]--;
                }
            }else if(temp[l]==0&&l!=(n-1)){
                if(temp[l]==0&&temp[l-1]>1){
                    temp[l]++;
                    temp[l-1]--;
                }
                if(temp[l]==0&&temp[l+1]>1){
                    temp[l]++;
                    temp[l+1]--;
                }
            }
        }
        for(int m=0; m<n; m++){
            if(temp[m]>0){
                answer++;
            }
            System.out.print(temp[m]);
        }
        return answer;
    }
}