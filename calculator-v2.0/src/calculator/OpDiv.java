package calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class OpDiv extends Operation{

    static String ch = "/";

    public OpDiv(int n) {
        super(ch,n);
    }

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        correctAnswer = op1 / op2;
        remainder = op1 % op2;
    }

    public String isCorrect()
    {
        if(usersAnswer == correctAnswer && remainder == usersRemainder)
            return "回答正确";
        else
            return "回答错误";
    }

    public String ptintQA()
    {
        operation();
        return "答案："+op1+" "+ch+" "+op2+" = "+correctAnswer+" "+remainder;
    }

    @Override
    public void isNumRight() {
        while(op2 == 0)
            getRanNum();
    }

    public void setRange(){
        minRange = 0;
        maxRange = maxInt;
    }

}
