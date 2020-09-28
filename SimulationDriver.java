import java.util.*;

public class SimulationDriver {

    public static void main(String[] args){
        Random rd = new Random(); //random object
        VotingService sim = new VotingService(); // One simulation

        sim.addQuestions(); // add questions into the list
        sim.addStudents(); // add students
        sim.answerQuestions(); // students answer each question
        sim.printStatistics(); // print results of each question
    }
}
