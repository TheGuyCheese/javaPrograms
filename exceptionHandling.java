public class exceptionHandling {
    public static void main(String[] args){
        try{
            int a = 50/0;
        }catch(ArithmeticException e){
            System.out.println("Exception thrown: ");
            System.out.println(e);
        }
    }
}
