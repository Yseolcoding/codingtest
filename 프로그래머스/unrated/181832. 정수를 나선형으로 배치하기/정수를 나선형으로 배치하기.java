class Solution {
    public int[][] solution(int n) {
		int[][] answer = new int[n][n];
        
        //세로
        int[] dx = new int[]{0, 1, 0 , -1};
        //가로
        int[] dy = new int[]{1, 0, -1, 0};
        
        int x = 0;
        int y = 0;
        int d = 0;
        
        for(int i=1; i<n*n+1; i++){
            answer[x][y] = i;
            System.out.println("d="+d+" "+ x+" " + y+" = " +answer[x][y]);
            
            int nx = x+dx[d];
            int ny = y+dy[d];
            
            if(ny < 0 || ny >=n || nx<0 || nx>=n||answer[nx][ny]!=0) {
         // if(ny>=n || nx>=n || ny<0 || nx<0 || answer[n
                d = (d+1)%4;
                nx = x + dx[d];
                ny = y + dy[d];
            }
            x = nx;
            y = ny;
            }
            
        return answer;
        }
            
    }