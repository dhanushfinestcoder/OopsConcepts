package JAVA8Features;


// before java-8 we cant able to define the methods in interfaces but now we can able to define
// two types of methods one is the default method and another is static method why default means we can define the common fctors in the interface
// example take mobile as a interface and andriod as class and ios as a class
interface  a
{
    void security();
    void processor();
    default  void call()
    {
        System.out.println("THis is mobile can call");
    }

}

// lamba exp is used to avoid creating unneccesary class to override the method we can directly overrde the methods of interfaces
interface b
{
    void demo();
}
class Andriod implements a{

    @Override
  public void security()
  {
      System.out.println("In andriod security is not good ");
  }

  @Override
    public void processor()
  {
      System.out.println("It uses amd");
  }
}

class iphone implements a{
    @Override
    public void security()
    {
        System.out.println("In iphone security is good");
    }
    @Override
    public void processor()
    {
        System.out.println("It uses bionic chip");
    }
}
public class Interfacesimplement
{
    public static void main(String[] args) {
        Andriod a=new Andriod();
        a.security();
        a.call();
        iphone i=new iphone();
        i.security();
        i.call();
        // example for lamba experesion
//        b b1;
//        b1=new b()
//        {
//           public  void demo()
//            {
//                System.out.println("This is demo for le");
//            }
//        };
//        b1.demo();
        // lamba expression
        b b1;
        b1=()->System.out.println("This is demo for le");
        b1.demo();


    }
}
