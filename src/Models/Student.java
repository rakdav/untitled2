package Models;

import Models.Person;

public class Student extends Person
{
    private String faculty;
    private int year;

    public Student(String name, int age,String fac,int y) {
        super(name, age);
        this.faculty=fac;
        this.year=y;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Факультет:"+faculty+"Курс:"+year);
    }
}
