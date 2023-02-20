

    interface A{
        public abstract void print1();
    }
    interface B{
        public abstract void print2();
    }
    class C implements A,B{
        @Override
        public void print1() {
            System.out.println("This is of Interface A");
        }

        @Override
        public void print2() {
            System.out.println("This is of Interface B");
        }
    }

    public class multipleInheritence {

    public static void main(String[] args){
        C obj = new C();
        obj.print1();
        obj.print2();

    }
}
