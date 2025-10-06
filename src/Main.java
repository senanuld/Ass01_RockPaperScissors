import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = false;

        do {
            String playerAchoice = getPlayerChoice(scanner, "player A");
            String playerBchoice = getPlayerChoice(scanner, "player B");

            String result = determine(playerAchoice,playerBchoice);
            System.out.println(result);

            playAgain = askToPlayAgain;

             String playerChoice = getPlayerChoice(scanner, "player Choice");
             System.out.println(playerAchoice);
             switch (playerChoice) {}
             System.out.println(playerBchoice);


        }   while (playAgain);
        System.out.printf("Thanks for playing!\n");
        scanner.close();
    }
    public static String getPlayerChoice(Scanner scanner, String playerName) {

        do {
            System.out.print("Please enter your choice: Rock, Paper, Scissors: ");
            char choice = scanner.nextLine().charAt(0);

    } while (scanner.hasNextLine());

        return scanner.nextLine();

    }    public static boolean isvalidChoice(Scanner scanner, String choice) {
        return choice.equals("R") || choice.equals("Rock") || choice.equals("Scissors");

    }
        public static boolean determine (char choiceA, char playerChoiceB) {

            if (choiceA.equalschoiceB);
                return choiceA + "vs" + choiceB + "it's a Tie";

            }

        }
            public static boolean askToPlayAgain(choice) {
            switch (choice) {
                case 'R':
                    return true;
                    case 'p':
                        return true;
                        case 's':
                            return true;
                            default:
                                return false;

            }

            }

        }