class InvalidScoreException extends RuntimeException {
    InvalidScoreException(int score) {
        super("Score " + score + " is out of valid range (0-100).");
    }
}

public class CustomUncheckedException {
    static String getGrade(int score) {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException(score);
        }
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    public static void main(String[] args) {
        int[] scores = {95, 82, 110, 65, -5};

        for (int score : scores) {
            try {
                System.out.println("Score " + score + " => Grade: " + getGrade(score));
            } catch (InvalidScoreException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
