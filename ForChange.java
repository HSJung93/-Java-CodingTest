import java.util.*;

public class ForChange {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        class Solution {
            public int solution(String str){

                int result = str.charAt(0) - '0';

                int length = str.length();

                for (int i=0; i<length; i++) {
                    int num = str.charAt(i)-'0';
                    if (num <= 1 || result <=1 ){
                        result += num;
                    } else {
                        result *= num;
                    }

                }
     
                return result;
            }
        }

        Solution mySolution = new Solution();
        int multiOrPlus = mySolution.solution(str);
        System.out.println(multiOrPlus);
        
    }
}