public class GradeCal {
    int marks;

    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 50) return 'C';
        else return 'F';
    }

    public static void main(String[] args) {
        GradeCal g = new GradeCal();
        g.marks = 85;
        System.out.println("Grade: " + g.calculateGrade());
    } 
}
