/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author curtismitchell
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private int age;
    private Person mother;
    
    public Person(String first, String last) {
        firstName = first;
        lastName = last;
        age = 18;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", mother=" + mother + '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public void birthday () {
        age++;
    }
}
