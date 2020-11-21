import Models.Person;
import Models.SchoolBoy;
import Models.Student;

public class MainClass {
    public static void main(String[] args) {
        Person person=new Person("Vasia",30);
        person.display();
        System.out.println();
        SchoolBoy schoolBoy=new SchoolBoy("Матвей",15,"МОУ СОШ №12",10);
        schoolBoy.display();
//        System.out.println(schoolBoy.getName());
//        System.out.println(schoolBoy.getAge());
        Student student=new Student("Иван",19,"Строительный",3);
        student.display();
    }
}
