import java.util.*;

public class ToOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        class Solution {
            public int solution(int n, int k){

                int result = 0;

                while (true) {
                    int target = (n/k)*k; 
                    result += (n-target);
                    n = target;

                    if (n<k) break;

                    result += 1;
                    n /= k;
                }

                result += (n-1);

                return result;
            }
        }

        Solution mySolution = new Solution();
        int howmany = mySolution.solution(n, k);
        System.out.println(howmany);
        
    }
}