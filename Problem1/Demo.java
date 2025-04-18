public class Demo {
    public static void main(String[] args) {

        Person Chris = new Person("Chris Morrison", 33, "M");
        System.out.println(Chris);

        Student Oscar = new Student("Oscar Cat", 11, "M", "OSC123", 4.0);
        System.out.println(Oscar);

        Teacher mrTeacher = new Teacher("Mr. Teacher", 48, "M", "Math", 70000);
        System.out.println(mrTeacher);

        CollegeStudent Lois = new CollegeStudent("Lois Lane", 24, "F", "LLA123", 3.5, 4, "English");
        System.out.println(Lois);
    }
}
