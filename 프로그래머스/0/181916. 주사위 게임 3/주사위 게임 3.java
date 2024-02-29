import java.lang.Math;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
         if(a==b&&b==c&&c==d&&d==a) answer=a*1111;
         else if(a==b&&b==c) answer = (10*a+d)*(10*a+d);
         else if(a==b&&b==d) answer = (10*a+c)*(10*a+c);
         else if(a==c&&c==d) answer = (10*a+b)*(10*a+b);
         else if(b==c&&c==d) answer = (10*b+a)*(10*b+a);
         else if(a==b&&c==d) answer = (a+c)*Math.abs(a-c);
         else if(a==c&&b==d) answer = (a+b)*Math.abs(a-b);
         else if(b==c&&a==d) answer = (b+a)*Math.abs(b-a);
         else if(a==b&&c!=d) answer = c*d;
         else if(a==c&&b!=d) answer = b*d;
         else if(a==d&&b!=c) answer = b*c;
         else if(b==c&&a!=d) answer = a*d;
         else if(b==d&&a!=c) answer = a*c;
         else if(c==d&&a!=b) answer = a*b;
         else{
             answer = (a<b)? a:b;
             answer = (c<answer)? c:answer;
             answer = (d<answer)? d:answer;
         }
        
        return answer;
    }
}