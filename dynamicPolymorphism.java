class Sample{
    public void display(){
        System.out.println("This is the overridden method!");
    }
}

public class dynamicPolymorphism extends Sample{
    public void display(){
        System.out.println("This is the overridding method of the Child Class!");
    }

    public static void main(String[] args){
        Sample obj = new dynamicPolymorphism();
        Sample obj1 = new Sample();
        obj1.display();
        obj.display();
    }
}
