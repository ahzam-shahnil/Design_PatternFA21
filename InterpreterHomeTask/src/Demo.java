import java.util.Stack;
import java.util.logging.Logger;

public class Demo {
    public static void main(String[] args) {
//        String exp = "7 3 - 2 1 + *";
        String exp = "* + 1 2 - 3 7";


        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(exp);

        // reverse StringBuilder input1
        input1.reverse();
        exp= input1.toString();
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = exp.split(" ");
        for (String s : tokenArray) {
            if (InterpreterUtil.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression expression = InterpreterUtil.getOperator(s, leftExpression, rightExpression);
                int result = expression.interpret();

                stack.push(new TerminalExpression(result));
            } else {
                Expression terminalExpression = new TerminalExpression(Integer.parseInt(s));
                stack.push(terminalExpression);
            }
        }
        System.out.println("(" + exp + ") = " + stack.pop().interpret());
    }
}
