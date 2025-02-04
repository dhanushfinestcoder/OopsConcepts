package Inheritance;

public class BaseClass
{
    // inheritance is the process of extracting the fetures from its parents
    // for example mobile is a base class and diff types of companies are sub class where each sub class can inherits the features from the base class
    // There are 5 types of inheritance available in java single,multi-level,hybrid,multiple,hirerachical
    // Single - One baseclass->inherits by Child class
    //Multi-level - A->B->C levels of inheritance
    //Multiple one class trying to inherits more than one base class it leads to dimond problem or ambiguity
    //Hireachical -one base class can be inherited by many sub class
    //Hybrid - not supports in java com of single and multiple


    String Cname;
    int ram;
    int batterCap;
    String Bname;

    public BaseClass()
    {

    }

    public BaseClass(int r,int b,String B,String cname)
    {
        this.batterCap=b;
        this.ram=r;
        this.Bname=B;
        this.Cname=cname;
    }
    void showDetails()
    {
        System.out.println("Category Name :"+Cname);
        System.out.println("Brand Name :"+Bname);
        System.out.println("Ram :"+ram);
        System.out.println("Battery :"+batterCap);
    }
}
class Child extends  BaseClass
{
    String bname;
    int batt;
    int ram;
    public Child(String bname,int batt,int ram,String cat)
    {
        super(batt,ram,bname,cat);
    }
}
class Main
{
    public static void main(String[] args) {

        Child cc=new Child("Iphone",3200,4,"Mobile");
        cc.showDetails();
    }
}
