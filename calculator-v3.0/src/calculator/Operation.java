package calculator;



public abstract class Operation {
    protected int op1,op2,n,correctAnswer,usersAnswer,usersRemainder,remainder;
    protected String ch;

    public Operation(String ch,int n) {
        super();
        this.ch = ch;
        this.n = n;
    }

    public abstract void operation();
    public abstract void isNumRight();

    protected void getRanNum()
    {
        op1 = (int)(Math.random()*Math.pow(10,n));
        op2 = (int)(Math.random()*Math.pow(10,n));
    }

    public void setUsersAnswer(int usersAnswer, int usersRemainder) //throws Exception
    {

        this.usersAnswer = usersAnswer;
        this.usersRemainder = usersRemainder;

    }

    public void setUsersAnswer(int usersAnswer) //throws Exception
    {
        setUsersAnswer(usersAnswer,0);
    }



    public String isCorrect()
    {
        if(usersAnswer == correctAnswer)
            return "回答正确";
        else
            return "回答错误";
    }

    public String printQuestion()
    {
        getRanNum();
        isNumRight();
        return op1+" "+ch+" "+op2+" =";
    }

    public String ptintQA()
    {
        operation();
        return "答案："+op1+" "+ch+" "+op2+" = "+correctAnswer;
    }




}
