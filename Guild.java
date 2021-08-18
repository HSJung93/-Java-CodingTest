import java.util.*;

public class Guild {

    public static int n;
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i=0; i<n; i++){
            arrayList.add(sc.nextInt());
        }

        class Solution {
            public int solution(ArrayList<Integer> arrayList, int n){

                Collections.sort(arrayList);

                int wholeGroup = 0;
                int oneGroup = 0;

                for (int i=0; i<n; i++){
                    oneGroup += 1;
                    if (oneGroup >= arrayList.get(i)){
                        wholeGroup += 1;
                        oneGroup = 0;
                    }
                }

                return wholeGroup;
            }
        }

        Solution mySolution = new Solution();
        int howmany = mySolution.solution(arrayList, n);
        System.out.println(howmany);
        
    }
}