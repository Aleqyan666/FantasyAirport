public class Pilot {
    private String name;
    private String lastName;

    private int age;
    private int yearsOfExperience;

    public Pilot() {
    }

    public Pilot(String name, String lastName, int age, int yearsOfExperience) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void displayPilotsInfo(){
        System.out.println("name : " + getName() + '\n' +
                "last name :  " + getLastName()  + '\n' +
                "age : " + getAge() + '\n' +
                "experience : " + getYearsOfExperience() + " years");
    }
}
