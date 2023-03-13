package gt.edu.umg.progra3.parcial1.pilas;

import java.util.Stack;
import static org.junit.Assert.*;

public class NotationParser {

    public Pila pila;

    public NotationParser(Pila pila) {
        this.pila = pila;
    }

    public String posFixToInfix(String expression){
        String[] tokens = expression.split(" ");
        Stack<String> stack = new Stack<>();

        for (String token1 : tokens) {
            if (token1.matches("\\d+")) {
                stack.push(token1);
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String infixExpr = "" + operand1 + " " + token1 + " " + operand2 + "";
                stack.push(infixExpr);
            }
        }

        return stack.pop();
    }

}
