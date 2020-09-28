public class Student {

    private int id; // student ID
    private String ans; // student's answer
    private int correctNum = 0; // number of correct answers
    private int incorrectNum = 0; // number of incorrect answers
    private int totalNum = 0; //
    private double score;

    Student(){

    }

    Student(int id) {
        this.id = id;
        this.ans = ans;
        this.correctNum = correctNum;
        this.incorrectNum = incorrectNum;
        this.totalNum = totalNum;
        this.score = score;
    }

    public void setAnswer(String ans) {
        this.ans = ans;
    }

    public void setCorrectNum() {
        correctNum++;
    }

    public void setIncorrectNum() {
        incorrectNum++;
    }

    public void setTotalNum() {
        totalNum++;
    }

    public String getAnswer() {
        return ans;
    }

    public int getCorrectNum() {
       return correctNum;
    }

    public int getIncorrectNum() {
        return incorrectNum;
    }

    public double getScore() {
        score = correctNum / totalNum;
        return score;
    }

}
