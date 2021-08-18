import java.util.*;

public class ImplementStack {

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(4);
        s.push(3);
        s.pop();
        s.push(2);
        s.push(1);
        s.pop();

        while (!s.empty()){
            System.out.println(s.peek() + " ");
            s.pop();
        }

    }
    
}
