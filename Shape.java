import java.util.*;

abstract class Shape {

    int a, b;

    abstract void printArea();
}
    class Rectangle extends Shape{

        public Rectangle(int x, int y){
            a = x;
            b=y;
        }
        public void printArea(){
            System.out.println("Area of Rectangle: "+a*b);
        }
    }
    class Triangle extends Shape{
        public Triangle(int x, int y){
            a = x;
            b=y;
        }
        public void printArea(){
            System.out.println("Area of Triangle: "+(0.5*a*b));
        }
    }

    class Circle extends Shape{
        public Circle(int x){
            a = x;
        }
        public void printArea(){
            System.out.println("Area of Circle: "+(3.14*a*a));
        }
    }

    class Shape2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Choose the option: \n1.Rectangle\n2.Triangle\n3.Circle\n4.Exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Please Enter the Values: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    Shape obj = new Rectangle(x, y);
                    obj.printArea();
                    break;
                case 2:
                    System.out.println("Please Enter the Values: ");
                    int x1 = sc.nextInt();
                    int y1 = sc.nextInt();
                    Shape obj2 = new Triangle(x1, y1);
                    obj2.printArea();
                    break;
                case 3:
                    System.out.println("Please Enter the Values: ");
                    int x2 = sc.nextInt();
                    Shape obj3 = new Circle(x2);
                    obj3.printArea();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter the Correct Values: ");
            }
        }



    }

}
