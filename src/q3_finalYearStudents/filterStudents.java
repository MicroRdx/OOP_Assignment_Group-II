package q3_finalYearStudents;

import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class filterStudents {

    public static void main(String[] args) throws IOException {
        List<Student> l = new ArrayList<Student>();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("STUDENT"), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                // use the data here
                l.add(new Student(
                        split[0],
                        Integer.parseInt(split[1]),
                        Integer.parseInt(split[2]),
                        split[3],
                        Integer.parseInt(split[4]),
                        Integer.parseInt(split[5]),
                        Integer.parseInt(split[6]),
                        Integer.parseInt(split[7]),
                        split[8]));
            }
        }

        Collections.sort(l); // SORT

        float avg;
        for (Student s : l) {
            avg = (s.first_year + s.second_year + s.third_year) / 3;

            if ((s.tenth > 60 && s.twelth > 60) &&
                s.science.equals("y") &&
                (avg > 65 || s.first_year > 80 || s.second_year > 80 || s.third_year > 80)&&
                s.arrears < 3) {
                System.out.println("Name: " + s.name);
                System.out.println("ID: " + s.id);
                System.out.println("SSC Score: " + s.tenth);
                System.out.println("Intermediate: " + s.twelth);
                System.out.println("Science Background: " + s.science);
                System.out.println("Final Average Marks : " + avg + "\n");
            }
        }
        System.out.println("Above is the list of all eligible candidates for the admission");
    }

}
