

class Question{
    String question;
    String[] options;
    int correctAnswer;

    Question(String queston, String[] options,int correctAnswers){
        this.question=question;
        this.options=options;
        this.correctAnswer=correctAnswer;

    }

    void display(){
        System.out.println(question);
        for(int i=0;i<=options.length;i++){
            System.out.println((i+1)+". "+options[i]);
        }
    }
}

class QuizSystem{
    static Question[] questions = new Question[10];
    static int count = 0;
    static int score = 0;

    static void addQuestions() {
    questions[count++] = new Question(
        "Java is?",
        new String[]{"Language", "Car", "Food", "Game"}, 1);

    questions[count++] = new Question(
        "2 + 2 = ?",
        new String[]{"3", "4", "5", "6"}, 2);

    questions[count++] = new Question(
        "OOP stands for?",
        new String[]{"Object Oriented Programming", "Only One Program", "Open Office Project", "None"}, 1);
    }

    static void takeQuiz(java.util.Scanner sc) {
    score = 0;

    for (int i = 0; i < count; i++) {
        questions[i].display();

        System.out.print("Your answer: ");
        int ans = sc.nextInt();

        if (ans == questions[i].correctAnswer) {
            score++;
        }
    }
    }

    static void startTimer() {
    long start = System.currentTimeMillis();

    System.out.println("Quiz started...");

    long end = System.currentTimeMillis();
    System.out.println("Time taken: " + (end - start)/1000 + " seconds");
    }

    
    public static void main(String[] args){

    }
}