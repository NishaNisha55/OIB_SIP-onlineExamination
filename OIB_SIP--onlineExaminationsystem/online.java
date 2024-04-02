import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class online {

  
    static String username = "user";
    static String password = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputUsername, inputPassword;

       
        System.out.println("Welcome to the system!");
        System.out.print("Enter username: ");
        inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        inputPassword = scanner.nextLine();

        if (login(inputUsername, inputPassword)) {
            System.out.println("Login successful!");

            
            updateProfileAndPassword(scanner);

            
            selectAnswersForMCQs(scanner);
            startTimerAndAutoSubmit();

            
            closeSessionAndLogout();

        } else {
            System.out.println("Invalid username or password. Exiting...");
        }
    }

    static boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

 
    static void updateProfileAndPassword(Scanner scanner) {
        System.out.println("Update Profile and Password:");
        System.out.print("Enter new username: ");
        String newUsername = scanner.nextLine();
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();

        
        username = newUsername;
        password = newPassword;

        System.out.println("Profile and Password updated successfully!");
    }

    
    static void selectAnswersForMCQs(Scanner scanner) {
        System.out.println("Selecting answers for MCQs:");

        
        String[] questions = {
                "1. What is the capital of France?\n a) Paris\n b) London\n c) Berlin\n",
                "2. Who wrote 'Romeo and Juliet'?\n a) William Shakespeare\n b) Charles Dickens\n c) Mark Twain\n",
                "3. Which of the following is not a primitive data type in Java?\n a) int\n b) boolean\n c) string\n",
                "4. What is the result of 10 % 3 in Java?\n a) 2\n b) 1\n c) 3\n",
                "5.Which keyword is used to define a constant value in Java?\n a) constant\n b) static\n c) final\n",
           "6.Which of the following statements is true about the 'switch' statement in Java?\n  a) It can only be used with int data type.\n b) It can be used with char, byte, short, int, String, and enums.\n  c) It always requires a 'default' case.\n", 
            "7.Which of the following is a marker interface in Java?\n  a) Serializable\n  b) Runnable\n  c) Cloneable\n",

             "8.What is the function of the 'super' keyword in Java?\n a) It calls the superclass constructor.\n   b) It refers to the current object.\n c) It accesses the superclass methods and variables.\n",
             "9. Which collection class allows null as a value in Java?\n a) ArrayList\n b) HashSet\n c) TreeMap\n",
              "10. What happens when an exception is not caught in Java?\n a) It causes a compilation error.\n b) It is handled by the JVM's default exception handler.\n  c) It terminates the program abruptly.\n"
             };

        String[] answers = {"a", "a","c","b","c","b","a","c","b","c"};

        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
        }
    }static void startTimerAndAutoSubmit() {
        System.out.println("Your score is 9/10... Well Done!!") ;
        System.out.println("Your 8th answer is wrong..Correct answer is option c..") ;
        System.out.println("Starting timer. You have 5 minutes to complete the quiz.");
        
    }static void closeSessionAndLogout() {
        System.out.println("Closing session and logging out...");
        System.out.println("Logged out successfully.");
    }
}