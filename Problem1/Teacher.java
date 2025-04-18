public class Teacher extends Person {
    private String subject; // subject teacher teaches
    private double salary; // annual salary

    // constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // get subject
    public String getSubject() {
        return subject;
    }

    // set subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // get salary
    public double getSalary() {
        return salary;
    }

    // set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // convert to string
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: $" + salary;
    }
}
