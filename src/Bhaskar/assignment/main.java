package Bhaskar.assignment;
class data{
    private int i;
    private char c;
    public void printvar1(){
        System.out.println(i+" is value of int member, and "+c+" is the value of char member");
        /*The above command will not work because it uses the integer and character values of i and c resp. which are uninitialized, also there is no setter method within the class to initialize them*/
    }
    public void printvar2(){
        int a;
        char b';
        System.out.println(a+" is value of int member, and "+b+" is the value of char member");
        /*The above command will not work because it uses the integer and character values of a and b resp. which are uninitialized, also there is no setter method within the class to initialize them*/

    }
}
class singleton{
    String s;
    static singleton Setstring(String q){
        singleton str=new singleton();
        str.s=q;
        return str;
    }
    public void getstring(){
        System.out.println("String being set is "+s);
    }
}

public class main {
public static void main(String[] args){
    data d=new data();
    d.printvar1();
    d.printvar2();
    singleton z= singleton.Setstring("Hello");
    z.getstring();
    }
}