package calculator;

public class OpMul extends Operation{
    static String ch = "X";

    public OpMul(int n) {
        super(ch,n);
    }

    @Override
    public void operation() {
        correctAnswer = op1 * op2;
    }

    @Override
    public void isNumRight() {}

    public void setRange(){
        minRange = 0;
        maxRange = maxInt * maxInt;
    }
}
