import java.util.Scanner;

public class CollegeFinder {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean isRunning = true;

        System.out.println("CollegeFinder PROGRAM");

        String[][] collegeData = CollegeFinder_Database.matrix;

        while (isRunning) {
            System.out.println("What would you like to do (type in a number)?\n" +
                    "1.  Find a college by major\n" +
                    "2.  Find a college by country\n" +
                    "3.  Exit program\n");
            String choice = scanner.nextLine();
            int choiceInt = Integer.parseInt(choice);

            if (choiceInt == 1) {
                findByMajor(collegeData);
            } else if (choiceInt == 2) {
                findByCountry(collegeData);
            } else if (choiceInt == 3) {
                System.out.println("Thank you and goodbye!");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    private static void findByMajor(String[][] collegeData) {

        //Scanner scanner = new Scanner(System.in);

        System.out.println("Pick your major:" +
                "1. Mathematics\n" +
                "2. Music\n" +
                "3. Biology\n" +
                "4. Engineering\n" +
                "5. Computer Science\n" +
                "6. Environmental Science\n" +
                "7. Agricultural Science\n" +
                "8. Business\n" +
                "9. Aerospace\n" +
                "10. Psychology\n" +
                "11. Architecture\n" +
                "12. Economics\n" +
                "13. Social Science\n" +
                "14. Law\n" +
                "15. History\n" +
                "16. Philosophy\n" +
                "17. Political Science\n" +
                "18. Accounting" +
                "19. Physics" +
                "20. Veterinary Science" +
                "21. Medicine");
        System.out.print("What is your major? (type the full name -- not number): ");
        String inputMajor = scanner.nextLine();

        //scanner.close();

        System.out.println(inputMajor);

        boolean found = false;
        int numberOfMatchesFound = 0;
        for (String[] college : collegeData) {
            if (college[0] != null) { // Ensure the row is initialized
                // Check intended majors (columns 5 to 8)
                for (int i = 5; i <= 8; i++) {
                    if (college[i] != null && college[i].equalsIgnoreCase(inputMajor)) {
                        System.out.println("--------------------------");
                        System.out.println("College Found: " + college[0]);
                        System.out.println("Type: " + college[1]);
                        System.out.println("City: " + college[2]);
                        System.out.println("State/Province: " + college[3]);
                        System.out.println("Country: " + college[4]);
                        System.out.println("Tuition Fee (out-of-state, estimated [does not include living costs, books, etc]: " + college[9]);
                        numberOfMatchesFound++;
                        found = true;
                        break; // No need to check other intended majors for this college
                    }
                }
            }
        }
        System.out.println("--------------------------");
        System.out.println("Total number of colleges found: " + numberOfMatchesFound);
        // If no match is found
        if (!found) {
            System.out.println("No college found with the major: " + inputMajor + ". Please reload and try again.");
        }
    }
    private static void findByCountry(String[][] collegeData) {

        //Declare variables
        int numberOfMatchesFound = 0;
        Boolean found = false;

        //Scanner scanner = new Scanner(System.in);

        //Input choice of country
        System.out.println("Please choose one of the following countries to find a college (type the full name -- not number):\n" +
                "1. United States\n" +
                "2. Canada\n" +
                "3. United Kingdom\n" +
                "4. Australia\n" +
                "5. China\n");
        System.out.print("What is your country of choice?: ");
        String inputCountry = scanner.nextLine();

        //scanner.close();

        System.out.println(inputCountry);

        for (String[] college : collegeData) {
            if (college[0] != null) { // Ensure the row is initialized
                for (int i = 4; i <= 4; i++) {
                    // Check the country (row 4)
                    if (college[4] != null && college[4].equalsIgnoreCase(inputCountry)) {
                        System.out.println("--------------------------");
                        System.out.println("College Found: " + college[0]);
                        System.out.println("Type: " + college[1]);
                        System.out.println("City: " + college[2]);
                        System.out.println("State/Province: " + college[3]);
                        System.out.println("Country: " + college[4]);
                        System.out.println("Tuition Fee (out-of-state, estimated [does not include living costs, books, etc]: " + college[9]);
                        numberOfMatchesFound++;
                        found = true;
                        break; // No need to check other intended majors for this college
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No college found with the major: " + inputCountry + ". Please reload and try again.");
        }
        System.out.println("--------------------------");
        System.out.println("Total number of colleges found: " + numberOfMatchesFound);
    }
}