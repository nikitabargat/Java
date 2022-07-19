
import java.util.Scanner;
import java.util.Stack;

public class minimumParenthesis {

    static int parenthesis(String A){

        Stack<Character> stk = new Stack<>();

        for(int i = 0; i<A.length(); i++){
            char c = A.charAt(i);

            if(stk.isEmpty() || c == '('){
                stk.push(c);
            } else if (stk.peek() == '(') {
                stk.pop();
            } else {
                stk.push(c);
            }
        }

       return stk.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.println(parenthesis(A));
        sc.close();
    }
}
