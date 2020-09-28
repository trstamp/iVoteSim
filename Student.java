public class Student {

    private int id; // student ID
    private String ans; // student's answer
    private int correctNum = 0; // number of correct answers
    private int incorrectNum = 0; // number of incorrect answers
    private int totalNum = 0; // number of questions answered
    private double score;

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
        correctNum += 1;
    }

    public void setIncorrectNum() {
        incorrectNum += 1;
    }

    public void setTotalNum() {
        totalNum += 1;
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

    public int getTotalNum() {
        return totalNum;
    }

    public double getScore() {
        score = correctNum / totalNum;
        return score;
    }

    public int getId() {
        return id;
    }
}
