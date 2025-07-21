//import OOPS.App;

import OOPS.AccesModifier;

import OOPS.AccesModifier;  // Correct import statement

public class AccessModifier1 {
    public static void main(String[] args) {
        AccesModifier obj = new AccesModifier(); // Creating an instance inside main

//        System.out.println("Outside of package non-child class: " + obj.str_1);

        App3 obj3=new App3();
        obj3.printformchildclass();
    }
}

class App3 extends AccesModifier {
    void printformchildclass(){
        App3 obj3=new App3();
        System.out.println("child class: " + obj3.str_1);
    }
}