public class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // get student id
    public String getIdNum() {
        return myIdNum;
    }

    // set student id
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    // get gpa
    public double getGPA() {
        return myGPA;
    }

    // set gpa
    public void setGPA(double gpa) {
        myGPA = gpa;
    }
}
