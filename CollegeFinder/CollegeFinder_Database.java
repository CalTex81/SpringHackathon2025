public class CollegeFinder_Database {
    // This makes the array accessible to other classes
    public static String[][] matrix;

    static {
        // Define the matrix here and populate it
        matrix = new String[50][10];

        //1. UC Berkeley
        matrix[0][0] = "University of California, Berkeley";
        matrix[0][1] = "Public";
        matrix[0][2] = "Berkeley";
        matrix[0][3] = "California";
        matrix[0][4] = "United States";
        matrix[0][5] = "Engineering";
        matrix[0][6] = "Computer Science";
        matrix[0][7] = "Business";
        matrix[0][8] = "Environmental Science";
        matrix[0][9] = "$55,000";


        //2. Stanford University

        matrix[1][0] = "Stanford University";
        matrix[1][1] = "Private";
        matrix[1][2] = "Stanford";
        matrix[1][3] = "California";
        matrix[1][4] = "United States";
        matrix[1][5] = "Computer Science";
        matrix[1][6] = "Engineering";
        matrix[1][7] = "Business";
        matrix[1][8] = "Biology";
        matrix[1][9] = "$67,000";

        //3. Purdue University

        matrix[2][0] = "Purdue University";
        matrix[2][1] = "Public";
        matrix[2][2] = "West Lafayette";
        matrix[2][3] = "Indiana";
        matrix[2][4] = "United States";
        matrix[2][5] = "Engineering";
        matrix[2][6] = "Computer Science";
        matrix[2][7] = "Aerospace";
        matrix[2][8] = "Business";
        matrix[2][9] = "$29,000";

        //4. UCLA

        matrix[3][0] = "University of California, Los Angeles";
        matrix[3][1] = "Public";
        matrix[3][2] = "Los Angeles";
        matrix[3][3] = "California";
        matrix[3][4] = "United States";
        matrix[3][5] = "Engineering";
        matrix[3][6] = "Computer Science";
        matrix[3][7] = "Psychology";
        matrix[3][8] = "Architecture";
        matrix[3][9] = "$65,000";

        //5. Northwestern University

        matrix[4][0] = "Northwestern University";
        matrix[4][1] = "Private";
        matrix[4][2] = "Evanston";
        matrix[4][3] = "Illinois";
        matrix[4][4] = "United States";
        matrix[4][5] = "Music";
        matrix[4][6] = "Biology";
        matrix[4][7] = "Economics";
        matrix[4][8] = "Psychology";
        matrix[4][9] = "$65,000";

        //6. Harvard University

        matrix[5][0] = "Harvard University";
        matrix[5][1] = "Private";
        matrix[5][2] = "Cambridge";
        matrix[5][3] = "Massachusetts";
        matrix[5][4] = "United States";
        matrix[5][5] = "Social Science";
        matrix[5][6] = "Mathematics";
        matrix[5][7] = "Computer Science";
        matrix[5][8] = "Biology";
        matrix[5][9] = "$60,000";

        //7. Cornell University

        matrix[6][0] = "Cornell Unviersity";
        matrix[6][1] = "Private";
        matrix[6][2] = "Ithaca";
        matrix[6][3] = "New York";
        matrix[6][4] = "United States";
        matrix[6][5] = "Engineering";
        matrix[6][6] = "Architecture";
        matrix[6][7] = "Agricultural Science";
        matrix[6][8] = "Biology";
        matrix[6][9] = "$60,000";

        //8. McGill University

        matrix[7][0] = "McGill University";
        matrix[7][1] = "Public";
        matrix[7][2] = "Montreal";
        matrix[7][3] = "Quebec";
        matrix[7][4] = "Canada";
        matrix[7][5] = "Medicine";
        matrix[7][6] = "Laws";
        matrix[7][7] = "Psychology";
        matrix[7][8] = "Engineering";
        matrix[7][9] = "CAD $50,000";

        //9. MIT

        matrix[8][0] = "Massachusetts Institute of Technology";
        matrix[8][1] = "Private";
        matrix[8][2] = "Cambridge";
        matrix[8][3] = "Massachusetts";
        matrix[8][4] = "United States";
        matrix[8][5] = "Computer Science";
        matrix[8][6] = "Engineering";
        matrix[8][7] = "Physics";
        matrix[8][8] = "Mathematics";
        matrix[8][9] = "$60,000";

        //10. Oxford

        matrix[9][0] = "University of Oxford";
        matrix[9][1] = "Public";
        matrix[9][2] = "Oxford";
        matrix[9][3] = "England";
        matrix[9][4] = "United Kingdom";
        matrix[9][5] = "Social Science";
        matrix[9][6] = "Law";
        matrix[9][7] = "History";
        matrix[9][8] = "Philosophy";
        matrix[9][9] = "£60,0000";

        //11. UPenn

        matrix[10][0] = "University of Philadeplhia";
        matrix[10][1] = "Private";
        matrix[10][2] = "Pennsylvania";
        matrix[10][3] = "Pennsylvania";
        matrix[10][4] = "United States";
        matrix[10][5] = "Law";
        matrix[10][6] = "Business";
        matrix[10][7] = "Medicine";
        matrix[10][8] = "Engineering";
        matrix[10][9] = "$55,000";

        //12. Williams College

        matrix[11][0] = "William's College";
        matrix[11][1] = "Private";
        matrix[11][2] = "Williamston";
        matrix[11][3] = "Massachusetts";
        matrix[11][4] = "United States";
        matrix[11][5] = "Economics";
        matrix[11][6] = "Political Science";
        matrix[11][7] = "Biology";
        matrix[11][8] = "Art";
        matrix[11][9] = "$60,000";

        //13. Ohlone College

        matrix[12][0] = "Ohlone College";
        matrix[12][1] = "Public";
        matrix[12][2] = "Fremont";
        matrix[12][3] = "California";
        matrix[12][4] = "United States";
        matrix[12][5] = "Social Science";
        matrix[12][6] = "Business";
        matrix[12][7] = "Accounting";
        matrix[12][8] = "Art";
        matrix[12][9] = "$15,000";

        //14. Santa Clara University

        matrix[13][0] = "Santa Clara University";
        matrix[13][1] = "Public";
        matrix[13][2] = "Santa Clara";
        matrix[13][3] = "California";
        matrix[13][4] = "United States";
        matrix[13][5] = "Business";
        matrix[13][6] = "Engineering";
        matrix[13][7] = "Computer Science";
        matrix[13][8] = "Law";
        matrix[13][9] = "$55,000";

        //15. Caltech

        matrix[14][0] = "California Institute of Technology";
        matrix[14][1] = "Public";
        matrix[14][2] = "Pasadena";
        matrix[14][3] = "California";
        matrix[14][4] = "United States";
        matrix[14][5] = "Physics";
        matrix[14][6] = "Computer Science";
        matrix[14][7] = "Engineering";
        matrix[14][8] = "Biology";
        matrix[14][9] = "$60,000";

        //16. Union College

        matrix[15][0] = "Union College";
        matrix[15][1] = "Private";
        matrix[15][2] = "Schenect";
        matrix[15][3] = "New York";
        matrix[15][4] = "United States";
        matrix[15][5] = "Engineering";
        matrix[15][6] = "Economics";
        matrix[15][7] = "Biology";
        matrix[15][8] = "Psychology";
        matrix[15][9] = "$60,000";

        //17. Princeton University

        matrix[16][0] = "Princeton University";
        matrix[16][1] = "Public";
        matrix[16][2] = "Princeton";
        matrix[16][3] = "New Jersey";
        matrix[16][4] = "United States";
        matrix[16][5] = "Public Policy";
        matrix[16][6] = "Economics";
        matrix[16][7] = "Agricultural Science";
        matrix[16][8] = "Biology";
        matrix[16][9] = "$60,000";

        //18. University of Cambridge

        matrix[17][0] = "University of Cambridge";
        matrix[17][1] = "Public";
        matrix[17][2] = "Cambridge";
        matrix[17][3] = "N/A";
        matrix[17][4] = "United Kingdom";
        matrix[17][5] = "Engineering";
        matrix[17][6] = "History";
        matrix[17][7] = "Law";
        matrix[17][8] = "Medecine";

        //19. ETH Zurich

        matrix[18][0] = "ETH Zurich";
        matrix[18][1] = "Public";
        matrix[18][2] = "Zurich";
        matrix[18][3] = "N/A";
        matrix[18][4] = "Switzerland";
        matrix[18][5] = "Engineering";
        matrix[18][6] = "Computer Science";
        matrix[18][7] = "Physics";
        matrix[18][8] = "Architecture";
        matrix[18][9] = "$2,000";

        //20. NUS

        matrix[19][0] = "National University of Singapore";
        matrix[19][1] = "Public";
        matrix[19][2] = "Singapore";
        matrix[19][3] = "N/A";
        matrix[19][4] = "Singapore";
        matrix[19][5] = "Engineering";
        matrix[19][6] = "Computer Science";
        matrix[19][7] = "Businuess";
        matrix[19][8] = "Medicine";
        matrix[19][9] = "$15,000";

        //21. University of Melbourne

        matrix[20][0] = "University of Melbourne";
        matrix[20][1] = "Public";
        matrix[20][2] = "Melbourne";
        matrix[20][3] = "Victoria";
        matrix[20][4] = "Australia";
        matrix[20][5] = "Medicine";
        matrix[20][6] = "Law";
        matrix[20][7] = "Engineering";
        matrix[20][8] = "Business";
        matrix[20][9] = "$30,000";

        //22. University of Toronto

        matrix[21][0] = "University of Toronto";
        matrix[21][1] = "Public";
        matrix[21][2] = "Toronto";
        matrix[21][3] = "Ontario";
        matrix[21][4] = "Canada";
        matrix[21][5] = "Engineering";
        matrix[21][6] = "Computer Science";
        matrix[21][7] = "Medicine";
        matrix[21][8] = "Business";
        matrix[21][9] = "$45,000";

        //23. Peking University

        matrix[22][0] = "Peking University";
        matrix[22][1] = "Public";
        matrix[22][2] = "Beijing";
        matrix[22][3] = "N/A";
        matrix[22][4] = "China";
        matrix[22][5] = "Law";
        matrix[22][6] = "Medicine";
        matrix[22][7] = "Business";
        matrix[22][8] = "Computer Science";
        matrix[22][9] = "$5,000";

        //24. University of Tokyo

        matrix[23][0] = "University of Tokyo";
        matrix[23][1] = "Public";
        matrix[23][2] = "Tokyo";
        matrix[23][3] = "N/A";
        matrix[23][4] = "Japan";
        matrix[23][5] = "Engineering";
        matrix[23][6] = "Medicine";
        matrix[23][7] = "Business";
        matrix[23][8] = "Computer Science";
        matrix[23][9] = "$6,000";

        //25. University of Sydney

        matrix[24][0] = "University of Sydney";
        matrix[24][1] = "Public";
        matrix[24][2] = "Sydney";
        matrix[24][3] = "New South Wales";
        matrix[24][4] = "Australia";
        matrix[24][5] = "Medicine";
        matrix[24][6] = "Law";
        matrix[24][7] = "Business";
        matrix[24][8] = "Engineering";
        matrix[24][9] = "$20,000";

        //26. UCL

        matrix[25][0] = "University College London";
        matrix[25][1] = "Public";
        matrix[25][2] = "London";
        matrix[25][3] = "England";
        matrix[25][4] = "United Kingdom";
        matrix[25][5] = "Medicine";
        matrix[25][6] = "Law";
        matrix[25][7] = "Engineering";
        matrix[25][8] = "Economics";
        matrix[25][9] = "$45,000";

        //27. University of Edinburgh

        matrix[26][0] = "University of Edinburgh";
        matrix[26][1] = "Public";
        matrix[26][2] = "Edinburgh";
        matrix[26][3] = "Scotland";
        matrix[26][4] = "United Kingdom";
        matrix[26][5] = "Law";
        matrix[26][6] = "Medicine";
        matrix[26][7] = "Engineering";
        matrix[26][8] = "History";
        matrix[26][9] = "$30,000";

        //28. UC Davis

        matrix[27][0] = "University of California, Davis";
        matrix[27][1] = "Public";
        matrix[27][2] = "Davis";
        matrix[27][3] = "California";
        matrix[27][4] = "United States";
        matrix[27][5] = "Veterinary Science";
        matrix[27][6] = "Agricultural Science";
        matrix[27][7] = "Biology";
        matrix[27][8] = "Engineering";
        matrix[27][9] = "$45,000";

        //28. UC Merced

        matrix[28][0] = "University of California, Merced";
        matrix[28][1] = "Public";
        matrix[28][2] = "Merced";
        matrix[28][3] = "California";
        matrix[28][4] = "United States";
        matrix[28][5] = "Engineering";
        matrix[28][6] = "Computer Science";
        matrix[28][7] = "Biology";
        matrix[28][8] = "Psychology";
        matrix[28][9] = "$40,000";

        //30. UC Riverside

        matrix[29][0] = "University of California, Riverside";
        matrix[29][1] = "Public";
        matrix[29][2] = "Riverside";
        matrix[29][3] = "California";
        matrix[29][4] = "United States";
        matrix[29][5] = "Business";
        matrix[29][6] = "Engineering";
        matrix[29][7] = "Biology";
        matrix[29][8] = "Psychology";
        matrix[29][9] = "$45,000";

        //31. UC Santa Barbara

        matrix[30][0] = "University of California, Santa Barbara";
        matrix[30][1] = "Public";
        matrix[30][2] = "Santa Barbara";
        matrix[30][3] = "California";
        matrix[30][4] = "United States";
        matrix[30][5] = "Biology";
        matrix[30][6] = "Psychology";
        matrix[30][7] = "Economics";
        matrix[30][8] = "Engineering";
        matrix[30][9] = "Biology";

        //31. UC Santa Cruz

        matrix[31][0] = "University of California, Santa Cruz";
        matrix[31][1] = "Public";
        matrix[31][2] = "Santa Cruz";
        matrix[31][3] = "California";
        matrix[31][4] = "United States";
        matrix[31][5] = "Biology";
        matrix[31][6] = "Psychology";
        matrix[31][7] = "Economics";
        matrix[31][8] = "Environmental Science";
        matrix[31][9] = "Computer Science";

        //32. IIT Bombay

        matrix[32][0] = "Indian Institute of Technology Bombay";
        matrix[32][1] = "Public";
        matrix[32][2] = "Mumbai";
        matrix[32][3] = "Maharashtra";
        matrix[32][4] = "India";
        matrix[32][5] = "Engineering";
        matrix[32][6] = "Computer Science";
        matrix[32][7] = "Physics";
        matrix[32][8] = "Mathematics";
        matrix[32][9] = "₹2,30,700";

        //33. University of Virginia

        matrix[33][0] = "University of Virginia";
        matrix[33][1] = "Public";
        matrix[33][2] = "Charlottesville";
        matrix[33][3] = "Virginia";
        matrix[33][4] = "United States";
        matrix[33][5] = "Law";
        matrix[33][6] = "Business";
        matrix[33][7] = "Engineering";
        matrix[33][8] = "Medicine";
        matrix[33][9] = "$60,000";

        //34. University of Michigan

        matrix[34][0] = "University of Michigan";
        matrix[34][1] = "Public";
        matrix[34][2] = "Ann Arbor";
        matrix[34][3] = "Michigan";
        matrix[34][4] = "United States";
        matrix[34][5] = "Engineering";
        matrix[34][6] = "Computer Science";
        matrix[34][7] = "Business";
        matrix[34][8] = "Economics";
        matrix[34][9] = "$60,000";
    }
}