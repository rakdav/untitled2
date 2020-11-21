package Models;

public class SchoolBoy extends Person {
    private String school;
    private int classNumber;

    public SchoolBoy(String name, int age,String sch,int number) {
        super(name, age);
        this.school=sch;
        classNumber=number;
    }

    public String getSchool() {
        return school;
    }

    public int getClassNumber() {
        return classNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Школа:"+school+" Класс:"+classNumber);
    }
}
