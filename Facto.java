public class Facto {

    public static int FactoIter(int n) {

        int result = 1;

        for (int i=1; i<=n; i++){
            result *= i;
        }

        return result;

    }

    public static int FactoRecur(int n){

        if (n==1) return 1;

        return n * FactoRecur(n-1);

    }

    public static void main(String[] args) {
        System.out.println(FactoIter(5));
        System.out.println(FactoRecur(5));

    }
    
}
