package calculator;

public class OpAdd extends Operation {
    static String ch = "+";

    public OpAdd(int n) {
        super(ch, n);
    }

    @Override
    public void operation() {
        correctAnswer = op1 + op2;
    }

    public void isNumRight() {
    }

}
