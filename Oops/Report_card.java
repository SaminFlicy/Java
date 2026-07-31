package Oops;

public class Report_card {
         private String studentName;
    private int[] scores;

    public Report_card(String studentName, int[] scores) {
        this.studentName = studentName;
        this.scores = scores;
    }

    public String getStudentName() {
        return studentName;
    }

    public int[] getScores() {
        return scores;
    }
    
}
