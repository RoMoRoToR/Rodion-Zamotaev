package ikbo2519pr1;
import java.lang.*;
public class Dog {
    private double age;
    private String gender;
    private String breed;

    public Dog(double age, String gender, String breed) {
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
