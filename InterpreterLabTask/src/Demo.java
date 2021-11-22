import java.util.Stack;


public class Demo {
    public static void main(String[] args) {
        String exp = "7 3 - 2 1 + *";

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
