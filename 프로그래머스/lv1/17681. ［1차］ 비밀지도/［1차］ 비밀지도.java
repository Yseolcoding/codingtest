class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] sarr1 = new String[n];
        String[] sarr2 = new String[n];
        
        
        for(int i = 0; i<n; i++){
            //sarr1[i] = Integer.toBinaryString(arr1[i]);
            sarr1[i] = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            //sarr2[i] = Integer.toBinaryString(arr2[i]);
            sarr2[i] = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i])));
            
            char[] char1 = sarr1[i].toCharArray();
            char[] char2 = sarr2[i].toCharArray();
            
            System.out.println(char1.length);
            
            for(int j = 0; j<n; j++){
                if(char2[j]=='1'){
                    char1[j]='1';
                }
                char1[j] = (char1[j]=='1')? '#':' ';
            }
            
             answer[i] = String.valueOf(char1);
        }
        
        return answer;
    }
}