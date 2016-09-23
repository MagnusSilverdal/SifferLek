import java.util.Random;
import java.util.Scanner;

/**
 * Created by magnus on 2016-09-16.
 */
public class SifferLek {

    static int[] termA;
    static int[] termB;
    static int[] answers;

    public static void main(String[] args) {
        createQuestions();
        askQuestions();
        correctAnswers();
    }

    // CreateQuestions
    // Generate 20 random integers in the range 1-100
    public static void createQuestions() {
        Random r = new Random();
        termA = new int[10];
        termB = new int[10];
        for (int i = 0 ; i < 10 ; i++) {
            termA[i] = r.nextInt(100);
            termB[i] = r.nextInt(100);
        }
    }

    // AskQuestions
    // Ask questions termA[i] + termB[i] = ? and save answers in answer. No validation yet....
    public static void askQuestions() {
        answers = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0 ; i < 10 ; i++) {
            System.out.print("What is " + termA[i] + " + " + termB[i] + " ? ");
            answers[i] = in.nextInt();
        }
    }

    // CorrectAswers
    public static void correctAnswers() {
        int score = 0;
        for (int i = 0; i < 10; i++) {
            if (termA[i] + termB[i] == answers[i]) {
                System.out.println(termA[i] + " + " + termB[i] + " = " + answers[i] + " (Correct)");
                score += 10;
            } else {
                System.out.println(termA[i] + " + " + termB[i] + " = " + answers[i]
                        + " (Wrong, correct answer is " + (termA[i] + termB[i]) + ")");
            }
        }
        System.out.println("\nTotal score: " + score);
    }
}
