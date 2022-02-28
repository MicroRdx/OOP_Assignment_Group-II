package q3_finalYearStudents;

class Student implements Comparable<Student> {

    String name, science, id;
    Integer tenth, twelth, first_year, second_year, third_year, arrears;

    public Student(String n, Integer e,Integer tw, String d, Integer fy, Integer  sy, Integer ty, Integer ar,String i) {
        name = n;
        tenth = e;
        twelth= tw;
        science = d;
        id=i;
        first_year = fy;
        second_year= sy;
        third_year= ty;
        arrears= ar;
    }

    public int compareTo(Student o) {
        return this.first_year.compareTo(o.tenth);
    }
}
