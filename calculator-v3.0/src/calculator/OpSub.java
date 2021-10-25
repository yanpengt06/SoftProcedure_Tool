package calculator;

public class OpSub extends Operation{
    static String ch = "-";

    public OpSub(int n) {
        super(ch,n);
    }

    public void operation() {
        correctAnswer = op1 - op2;
    }

    public void isNumRight(){
        while(op1 == op2)
            getRanNum();
        if(op1 < op2)
        {
            int temp = op1;
            op1 = op2;
            op2 = temp;
        }
    }


}
