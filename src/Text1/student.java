package Text1;

import java.io.Serial;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class student implements Comparable<student>, Serializable {
    @Serial
    private static final long serialVersionUID = -8005727850474312191L;
    private String name;
    private Integer age;

    private transient String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", addres='" + address +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public student(String str){
        String[] s = str.split(",");
        this.name = s[0];
        this.age = Integer.parseInt(s[1]);
    }

    @Override
    public int compareTo(student o) {
        int i = this.age - o.getAge();
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
