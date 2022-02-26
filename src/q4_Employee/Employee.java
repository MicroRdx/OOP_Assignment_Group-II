package q4_Employee;

class Employee implements Comparable<Employee> {

    String name, dept, desig;
    Integer empid, salary;

    public Employee(String n, Integer e, String d, String designation, Integer f) {
        name = n;
        empid = e;
        dept = d;
        desig = designation;
        salary = f;
    }

    public String toString() {
        return "\n Name=" + name + ",Employee ID=" + empid + ",Department=" + dept + ",Designation=" + desig
                + ",Salary=" + salary;
    }

    public int compareTo(Employee o) {
        return (this.dept.compareTo(o.dept)) + (this.salary.compareTo(o.salary));
    }
}
