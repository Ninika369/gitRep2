package java;

/**
 * @Author: George Sun
 * @Date: 2022-11-24-13:54
 * @Description: java
 */
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int weight;
    public int age;
    public String gender;

    public Student() {

    }

    public Student(int a, int w, String g) {
        weight = w;
        age = a;
        gender = g;
    }
}
