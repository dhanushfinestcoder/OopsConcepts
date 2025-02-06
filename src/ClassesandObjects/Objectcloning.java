package ClassesandObjects;

class Student implements Cloneable
{
    String name;
    int id;
    public Student(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public void display()
    {
        System.out.println("Name "+name);
        System.out.println("Id "+id);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Objectcloning
{
    public static void main(String[] args) throws Exception{
        Student ss=new Student("dhanush",10);
        Student sd=(Student) ss.clone();
        ss.name="Dhanush";
        ss.display();
        sd.display();
    }
}
