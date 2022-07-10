import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        EnterGrades scorelist = new EnterGrades();
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> scores = scorelist.enterScores(reader);//enters grades
        ArrayList<Integer> distribution = scorelist.GradeDistribution(scores);
        scorelist.printDistribution(distribution);
    }
}