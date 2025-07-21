public class AccesModifier {
//    public
   protected  String str_1="I am a public member";
    void printfromclass(){
        System.out.println("with in a class");
    }
    public static void main(String[] args) {
        AccesModifier obj = new AccesModifier();
        obj.printfromclass();
        System.out.println("within class"+obj.str_1); // Accessing public member

        App2 obj2=new App2();
        obj2.printoutsideofclass();
    }
}

class  App2{
    void printoutsideofclass(){
        AccesModifier obj = new AccesModifier();
        System.out.println("with in package but out side of class "+obj.str_1);

    }
}