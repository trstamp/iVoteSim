import java.util.LinkedList;
import java.util.Random;

public class VotingService {

    LinkedList<Student> students = new LinkedList<>(); // list of all students participating (Student objects)
    LinkedList<Question> questions = new LinkedList<>(); // list of all questions (Question objects)

    /** Create questions and add them to questions linkedlist **/
    public void addQuestions() {
        // initializing the questions separately so the code looks a bit cleaner
        String p1 = "In what year was Java invented?";
        String p2 = "Java supports the for-each loop feature.";
        String p3 = "Which type is a non-primitive data type?";
        String p4 = "Which data type cannot hold the number 1000?";
        String p5 = "Is Dr. Sun the best professor?";

        Question q1 = new Question(1,p1,"a","a","b","c","d","1996","1985","2002","1900");
        Question q2 = new Question(2,p2,"a","a","b","True","False");
        Question q3 = new Question(3,p3,"c","a","b","c","d","Byte","Int","String","Float");
        Question q4 = new Question(4,p4,"b","a","b","c","d","Int","Byte","Long","Short");
        Question q5 = new Question(5,p5,"a","a","b","Yes!","No...");

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);

    }

    public void addStudents() {
        //adding 30 students to each game
        for(int i = 0; i < 30; i++){
            Student student = new Student(i+1);
            students.add(student);
        }
    }

    public void answerQuestions() {
        Random rd = new Random();
        for(Student st: students) {
            //set and check answers for each student
            for(Question qt: questions){
                int r = rd.nextInt(4); // generates a number, 0 - 3
                if(qt.getqType() == "TrueFalse"){
                    if(r == 0 || r == 1) {
                        st.setAnswer("a");
                        qt.setA();
                    }
                    else {
                        st.setAnswer("b");
                        qt.setB();
                    }
                }
                else{
                    if(r == 0) {
                        st.setAnswer("a");
                        qt.setA();
                    }
                    else if(r == 1) {
                        st.setAnswer("b");
                        qt.setB();
                    }
                    else if(r == 2) {
                        st.setAnswer("c");
                        qt.setC();
                    }
                    else {
                        st.setAnswer("d");
                        qt.setD();
                    }
                }

                if(qt.getAnswer() == st.getAnswer()) {
                    st.setCorrectNum();
                }
                else {
                    st.setIncorrectNum();
                }
                st.setTotalNum();
                //ended here Sunday Night
            }

        }
    }

    public void printStatistics(){
        for(Question qt: questions) {
            System.out.println("~Question " + qt.getQuestionNum() + "~");
            System.out.println(qt.getQuestion());

            if (qt.getqType() == "TrueFalse") {
                System.out.println(qt.getOp1() + " | " + qt.getOp2());
                System.out.println("Number of A's: " + qt.getA());
                System.out.println("Number of B's: " + qt.getB());
                System.out.println("Answer: " + qt.getAnswer());
            }
            else {
                System.out.println(qt.getOp1() + " | " + qt.getOp2() + " | " + qt.getOp3() + " | " + qt.getOp4());
                System.out.println("Number of A's: " + qt.getA());
                System.out.println("Number of B's: " + qt.getB());
                System.out.println("Number of C's: " + qt.getC());
                System.out.println("Number of D's: " + qt.getD());
                System.out.println("Answer: " + qt.getAnswer());
            }
        }
        System.out.println();
    }

    public void printScores() {
        System.out.println("~Student Scores~");
        for(Student st: students) {
            System.out.println("Student " + st.getId() + ": " + st.getCorrectNum() + "/5");
        }
    }

}
