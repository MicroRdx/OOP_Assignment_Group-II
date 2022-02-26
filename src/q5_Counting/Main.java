package q5_Counting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/raj/Development/Java/Text.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;

            int para = 0;

            int p1_lineCount = 0;
            int p1_wordCount = 0;
            int p1_charCount = 0;
            int p2_lineCount = 0;
            int p2_wordCount = 0;
            int p2_charCount = 0; 
  // Reading the Paragraphs 
            while ((line = bufferedReader.readLine()) != null && para < 2) {
                if(para == 0){// Checking the first paragraph
                    if (line.equals("")) {
                        para += 1;
                    } else {
                        String sentence[] = line.split("[!?.:]+");
                        p1_lineCount += sentence.length;
                        String words[] = line.split("\\s+");
                        p1_wordCount += words.length;
                        p1_charCount += line.length();
                    }
                }else{ // Checking the second paragraph

                    if (line.equals("")) {
                        para += 1;
                    } else {
                        String sentence[] = line.split("[!?.:]+");
                        p2_lineCount += sentence.length;
                        String words[] = line.split("\\s+");
                        p2_wordCount += words.length;
                        p2_charCount += line.length();
                    }
                }

            }
//Printing the Results
            System.out.println("The First Paragraph has: ");
            System.out.println("Lines : " + p1_lineCount);
            System.out.println("Words : " + p1_wordCount);
            System.out.println("Characters : " + p1_charCount);

            System.out.println("\nThe Second Paragraph has: ");
            System.out.println("Lines : " + p2_lineCount);
            System.out.println("Words : " + p2_wordCount);
            System.out.println("Characters : " + p2_charCount);
        }
    }

}
