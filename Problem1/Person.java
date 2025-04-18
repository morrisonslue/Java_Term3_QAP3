public class Person {
    protected String myName; // name of the person
    protected int myAge; // person's age
    protected String myGender; // M for male, F for female

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }

    // get name
    public String getName() {
        return myName;
    }

    // set name
    public void setName(String name) {
        myName = name;
    }

    // get age
    public int getAge() {
        return myAge;
    }

    // set age
    public void setAge(int age) {
        myAge = age;
    }

    // get gender
    public String getGender() {
        return myGender;
    }

    // set gender
    public void setGender(String gender) {
        myGender = gender;
    }
}
