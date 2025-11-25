import java.util.Scanner;
class WrongAge extends Exception{
    public WrongAge(String msg) {
        super(msg);
        
    }
}
class Father{
    int FatherAge;
    Father() throws WrongAge{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fathers Age: ");
        FatherAge=sc.nextInt();
        if(FatherAge<0){
            throw new WrongAge("FATHERS AGE CANNOT BE NEGATIVE");
        }
    }
}
class Son extends Father{
    int SonAge;
    Son()throws WrongAge{
        super();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Sons Age:");
        SonAge=sc.nextInt();
        if(SonAge>=FatherAge){
            throw new WrongAge("Sons age is greater than fathers age");
        }
        else if (SonAge<0){
            throw new WrongAge("Sons Age cannot be negative");
        }
    }
    void display(){
        System.out.println("Sons Age:"+SonAge);
        System.out.println("Fathers Age:"+FatherAge);
    }
}
public class InheritanceAgeDemo{
    public static void main(String [] args){
        try{
            Son S=new Son();
            System.out.println();
            S.display();
            
            System.out.println("---Details----");
            S.display();
            
        }
        catch(WrongAge e){
            System.out.println("Exception:" +e.getMessage());
        }

    }
}