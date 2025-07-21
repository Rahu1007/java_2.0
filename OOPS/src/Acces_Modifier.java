public class Acces_Modifier {
    public String str_1="I am a public member";
    void printfromclass(){
        System.out.println("withinclass"+str_1);
    }
    public static void main(String[] args) {
        Acces_Modifier obj=new Acces_Modifier();
        obj.printfromclass();
        System.out.println(obj.str_1);

        app2 obj1=new app2();
        obj1.printoutsideofclass();
        System.out.println();
    }
}

class app2{
    void printoutsideofclass(){
        app2 obj=new app2();
        System.out.println("outside of class"+obj.str_1);
    }
}