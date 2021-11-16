import java.util.*;

// vscode 데브를 사용하여 푸쉬
public class Knight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ���� ����Ʈ�� ��ġ �Է¹ޱ�
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' + 1;

        class Solution {
            public int solution(int row, int column){

                int cnt = 0;
                
                int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
                int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

                for (int i=0; i<8; i++){
                    int nx = row + dx[i];
                    int ny = column + dy[i];

                    if (nx >0 && ny >0 && nx<=8 && ny<=8) cnt +=1 ;
                }

                return cnt;
            }
        }

        Solution mySolution = new Solution();
        int result = mySolution.solution(row, column);
        System.out.println(result);
    }

}