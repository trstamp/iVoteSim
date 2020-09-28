class Question {

    private int questionNum;
    private int a = 0, b = 0, c = 0, d = 0;
    private String qType; //decides which constructor to use
    private String question;
    private String answer; // answer (letter)
    private String o1; // char variables are the letters (a,b,c,d)
    private String o2;
    private String o3;
    private String o4;
    private String op1; // String variables are the words
    private String op2;
    private String op3;
    private String op4;

    // constructor for True/False or Yes/No questions
    // I debated having the two options be boolean values but decided against it so I wouldn't have to make more values
    Question(int questionNum, String question, String answer, String o1, String o2, String op1, String op2){
        this.questionNum = questionNum;
        this.question = question;
        this.o1 = o1;
        this.o2 = o2;
        this.op1 = op1;
        this.op2 = op2;
        this.answer = answer;
        qType = "TrueFalse";
    }

    // constructor for A/B/C/D questions
    Question(int questionNum, String question, String answer, String o1, String o2, String o3, String o4, String op1, String op2, String op3, String op4) {
        this.questionNum = questionNum;
        this.question = question;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.answer = answer;
        qType = "MultipleChoice";
    }

    //setters will increment each number
    public void setA() {
        a++;
    }

    public void setB() {
        b++;
    }

    public void setC() {
        c++;
    }

    public void setD() {
        d++;
    }

    //getters will return each value
    public int getQuestionNum() {
        return questionNum;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getqType() {
        return qType;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public String getOp1() {
        return op1;
    }

    public String getOp2() {
        return op2;
    }

    public String getOp3() {
        return op3;
    }

    public String getOp4() {
        return op4;
    }

}
