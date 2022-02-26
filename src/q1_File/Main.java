package q1_File;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) throws FileNotFoundException,IOException {

        boolean flag = false;
        int count = 0;
        // File file = new File("JavaFile.txt");
        File f = new File("NewDirectory/JavaFile.txt");
        File file1 = new File("newfile.txt");
        file1.createNewFile();
        Scanner sc2 = new Scanner(new FileInputStream("newfile.txt"));
        try {
            if (!f.getParentFile().exists())
                f.getParentFile().mkdirs();
            if (!f.exists()){
                f.createNewFile();
                System.out.println("New file" + f.getName() + " has been created.");
            }
            else{
                System.out.println("The file already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
        String program = "Elephants are the largest existing land animals.\n"+ 
        "Three living species are currently recognised: the African bush elephant, the African forest elephant, and the Asian elephant.\n"+
        "They are an informal grouping within the proboscidean family Elephantidae.\n"+
        "Elephantidae is the only surviving family of proboscideans; \n";
        try {
            // FileWriter output = new FileWriter("JavaFile.txt");
            FileWriter output = new FileWriter("NewDirectory/JavaFile.txt");
            output.write(program);
            System.out.println("Data is written to the file.");
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        try {
                // FileReader fr = new FileReader("JavaFile.txt");
                FileReader fr = new FileReader("NewDirectory/JavaFile.txt");
                FileWriter fw = new FileWriter("newfile.txt");
                String str = "";
                int i;
                while ((i = fr.read()) != -1) {
                    str += (char)i;
                }
                fw.write(str);
                fr.close();
                fw.close();
                System.out.println("Paragraph has been copied & pasted to new file!");
            }
            catch (IOException e) {
                System.out.println("There are some IOException");
            }
        String str1="recognised";
        while(sc2.hasNextLine()) {
            String line = sc2.nextLine();
            if(line.indexOf(str1)!=-1) {
                flag = true;
                count = count+1;
            }
        }
        if(flag) {
            System.out.println(str1);
            } else {
            System.out.println("Word not found");
        }
    }
}
