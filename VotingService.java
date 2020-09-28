import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class VotingService {

    LinkedList<Student> students = new LinkedList<Student>(); // list of all students participating (Student objects)
    LinkedList<Question> questions; // list of all questions (Question objects)

    void addQuestions() {
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

    void addStudents() {
        //adding 30 students to each game
        for(int i = 0; i < 30; i++){
            Student student = new Student(i);
            students.add(student);
        }
    }

    void answerQuestions() {
        int r = (int)(Math.random() * 4); //generate an answer
        for(Student st: students) {
            //set and check answers for each student
            for(Question qt: questions){
                if(qt.getqType() == "TrueFalse"){
                    if(r == 0 || r == 1) {
                        st.setAnswer("a");
                    }
                    else {
                        st.setAnswer("b");
                    }
                }
                else{
                    if(r == 0 || r == 1) {
                        st.setAnswer("a");
                    }
                    else if(r == 2) {
                        st.setAnswer("b");
                    }
                    else if(r == 3) {
                        st.setAnswer("c");
                    }
                    else {
                        st.setAnswer("d");
                    }
                }

                if(qt.getAnswer() == st.getAnswer()) {
                    st.setCorrectNum();
                }
                else {
                    st.setIncorrectNum();
                }
                st.setTotalNum();
            }

        }
    }

    void printStatistics(){

    }


}
