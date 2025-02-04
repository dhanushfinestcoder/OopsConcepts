package ClassesandObjects;

// class is named group of properties and methods it is an template for an object
// object is an instance for an class
// for example mobile is an class it has an battery , camera and processor
// iphone,samsung,iqoo are the instance for an class

public class Democlass
{
    int age;
    String name;
    float salary;

    // Default costructor
    public Democlass()
    {

    }
    // parametrized constructor
    public Democlass(int a,String N,float s)
    {
        this.age=a;
        this.name=N;
        this.salary=s;
    }

    // copy cons
    public Democlass(Democlass other)
    {
        this.age=other.age;
        this.name=other.name;
        this.salary=other.salary;
    }
    // it overrides the actual to string methods
    @Override
    public String toString() {
        return "Democlass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {


        // variables inside the object is instance variables and variables associate with class is known as ref variable pointing to the object
        // calling of def cons
        // const is special function and call when object is created it has return type as class name
        Democlass d0=new Democlass();
        System.out.println(d0);
        // calling of param cons
        Democlass d1=new Democlass(21,"Dhanush",10000.0f);
        System.out.println(d1);
       // calling of copy cons
        Democlass d2=new Democlass(d1);
        System.out.println(d2);

    }
}
