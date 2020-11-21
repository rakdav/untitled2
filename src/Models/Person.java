package Models;

public class Person
{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }
    public void display()
    {
        System.out.print("Имя:"+name+" Возраст:"+age);
    }
}
