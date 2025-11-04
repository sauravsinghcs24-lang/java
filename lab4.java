import java.util.Scanner;
abstract class shape{
    int a,b,l,h,d;
   
    abstract void PrintArea();
}
class rectangle extends shape{
    rectangle(int x,int y){
        a=x;
        b=y;
    }
    void PrintArea(){
        System.out.println("Area of rectange="+(a*b));
    }

}
class triangle extends shape{
    triangle(int x, int y){
        l=x;
        h=y;
    }
    void PrintArea(){
        System.out.println("AREA OF TRIANGLE="+(h*l*0.5));
    }
}
class circle extends shape{
    circle(int r){
         d = r;
    }
    void PrintArea(){
        System.out.println("Area of circle="+(3.14*d*d));
    }
}
public class lab4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        shape s;
        System.out.println("Enter the dimension of the rectangle:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        s= new rectangle(a,b);
        s.PrintArea();

        System.out.println("Enter the dimension of the triangle:");
        int l= sc.nextInt();
        int h= sc.nextInt();
        s= new triangle(l,h);
        s.PrintArea();

        System.out.println("Enter the dimension of the circle:");
        int d= sc.nextInt(); 
        s= new circle(d);
        s.PrintArea();  
        
        sc.close();

    }
}