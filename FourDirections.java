import java.util.*;

public class FourDirections {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");

        class Solution {
            public int[] solution(int n, String[] plans){

                int x =1, y =1;

                int[] dx = {-1, 1, 0, 0};
                int[] dy = {0, 0, -1, 1};

                char[] moveTypes = {'U', 'D', 'L', 'R'};

                for (int i=0; i<plans.length; i++) {
                    char plan = plans[i].charAt(0);
                    int nx=-1 , ny=-1;
                    for (int j=0; j<4; j++){
                        if (plan == moveTypes[j]){
                            nx = x + dx[j];
                            ny = y + dy[j];
                        }
                    }

                    if (nx < 1 || ny<1 || nx>n|| ny>n) continue;

                    x = nx;
                    y = ny;

                }

                int[] result = {x, y};

                return result;
            
            }
        }

        Solution mySolution = new Solution();
        int[] multiOrPlus = mySolution.solution(n, plans);
        int x = multiOrPlus[0];
        int y = multiOrPlus[1];
        System.out.println(x + " " + y);
        
    }
}