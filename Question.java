class Question {

    private int questionNum;
    private String qType;
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

    String getQuestion() {
        return question;
    }

    String getAnswer() {
        return answer;
    }

    String getqType() {
        return qType;
    }

}
