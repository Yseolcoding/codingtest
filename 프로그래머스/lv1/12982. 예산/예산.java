import java.util.Arrays;

class Solution {
    static int sumr = 0;
    public int solution(int[] d, int budget) {
        int answer = 0;
        if (sum(d) <= budget) {
            answer = d.length;
        } else {
            Arrays.sort(d);
            sumr = 0;
            for (int j=0; j<d.length; j++) {
                sumr += d[j];
                if (sumr == budget) {
                    answer = j+1;
                    break;
                }
                if(sumr > budget){
                    answer = j;
                    break;
                }
            }
        }
        return answer;
    }
    public static int sum(int[] d) {
        for (int i = 0; i < d.length; i++) {
            sumr += d[i];
        }
        return sumr;
    }
}