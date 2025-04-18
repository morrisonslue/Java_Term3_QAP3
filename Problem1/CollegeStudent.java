public class CollegeStudent extends Student {
    private String major; // student's major
    private int year; // year in college

    // constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // get major
    public String getMajor() {
        return major;
    }

    // set major
    public void setMajor(String major) {
        this.major = major;
    }

    // get year
    public int getYear() {
        return year;
    }

    // set year
    public void setYear(int year) {
        this.year = year;
    }

    // making this a string
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
