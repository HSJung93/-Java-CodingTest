import java.util.*;

public class MultiplyOrPlus {

    public static int money;
    public static int n;
    public static ArrayList<Integer> coinList = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        money = sc.nextInt();

        n = sc.nextInt();

        for (int i=0; i<n; i++){
            coinList.add(sc.nextInt());
        }

        class Solution {
            public int solution(ArrayList<Integer> coinList, int money){
                int cnt = 0;

                for (int i=0; i<coinList.size();i++){
                    cnt += money/coinList.get(i);
                    money %= coinList.get(i);
                }

                return cnt;
            }
        }

        Solution mySolution = new Solution();
        int howmany = mySolution.solution(coinList, money);
        System.out.println(howmany);
        
    }
}