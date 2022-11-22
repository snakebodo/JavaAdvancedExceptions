package Colection;

import java.util.Objects;

public class Employee {
    private String name;
    private int id;
    private int age;
    private String position;

    public Employee(String name, int id, int age, String position) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
// HashCode mult mai usor il generezi : Generate> equals() and hashCode()
    //primul pas lasam default
    //pasul 2 lasam toate atributiile bifate
    //pasul 3 selectam doar id si name
    //pasul patru nu selectam nimic
    //dam create
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(position, employee.position);
    }
//aici se aplica pasul 3 unde am selectat doar id si name
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
