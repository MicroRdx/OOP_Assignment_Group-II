package q4_Employee;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class sortEmployee {

	public static void main(String[] args) {
		
		  Employee emp1 = new Employee("Jack",101,"Development","System Engineer",7000);
	        Employee emp2 = new Employee("Joe",104,"CIS","Operation Executive",5000);
	        Employee emp3 = new Employee("Jake",103,"Development","Software Developer",1000);
	        Employee emp4 = new Employee("Sam",102,"CIS","Senior Opration Executive",950);
	        Employee emp5 = new Employee("Albert",105,"Database","DBA",65000 );
	        Employee emp6 = new Employee("Patrick",106,"Development","System Engineer",8800);
	        Employee emp7 = new Employee("Kathi",109,"CIS","Operation Executive",750);
	        Employee emp8 = new Employee("Rhua",110,"CIS","Senior Opration Executive",800);
	        Employee emp9 = new Employee("Grig",108,"Database","DBA",5800);
	        Employee emp10 = new Employee("Ruma",107,"Database","DBA",4300);
       
        List<Employee> l = new ArrayList<Employee>();
        l.add(emp1);
        l.add(emp2);
        l.add(emp3);
        l.add(emp4);
        l.add(emp5);
        l.add(emp6);
        l.add(emp7);
        l.add(emp8);
        l.add(emp9);
        l.add(emp10);

        Collections.sort(l); // SORT

        System.out.println(l); // Display list

	}

}
