package awa;

import java.util.Objects;

public class Person {
    int birthYear;
    String name;

    public Person(int yearOfBirth, String name) {
        this.birthYear = yearOfBirth;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals викликався");
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return birthYear == that.birthYear &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode викликався - + " + Objects.hash(birthYear, name));
        return Objects.hash(birthYear, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "yearOfBirth=" + birthYear +
                ", name='" + name + '\'' +
                '}';
    }
}
