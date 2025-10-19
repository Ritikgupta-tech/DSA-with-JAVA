public class oopsabstraction{
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        chiken c =new chiken();
        c.eat();
        c.walk();
        mustang myhorse=new mustang();

        //animal->horse->mustang


        
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }

   /* public Animal() {
        color="black";
    }*/
    

     void eat(){
        System.out.println("animal eats");
     }
     abstract void walk();

}
class  Horse extends Animal{
    Horse(){
        System.out.println("horse constructer called");
    }
    void changeColor(){
        System.out.println(color="blue");
    }
    void walk(){
        System.out.println("walks of 4 legs");
    }
}
class mustang extends Horse{

    mustang() {
        System.out.println("mustang constructer called");
    }
    
}

class chiken extends Animal{
    void walk(){
        System.out.println("walks 2 legs");
    }
}