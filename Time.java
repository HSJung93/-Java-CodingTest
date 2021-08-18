import java.util.*;

public class Time {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();

        class Solution {
            public int solution(int h){

                int cnt = 0;

                for (int i = 0; i <= h; i++) {
                    for (int j = 0; j < 60; j++) {
                        for (int k = 0; k < 60; k++) {
                            // �� �ð� �ȿ� '3'�� ���ԵǾ� �ִٸ� ī��Ʈ ����
                            if (i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3) cnt++;
                        }
                    }
                }
     
                return cnt;
            }
        }

        Solution mySolution = new Solution();
        int result = mySolution.solution(h);
        System.out.println(result);
    }

}