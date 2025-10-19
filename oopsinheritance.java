

/*public class oopsinheritance{
    public static void main(String[] args) {
        //Fish shark=new Fish();
       // shark.eat();

       dog dogesh =new dog();
       dogesh.eat();
       dogesh.legs=4;
       System.out.println(dogesh.legs);
        
    }

}

// MULTI-LEVEL INHERITANCE
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
 
    };

    void breath (){
        System.out.println("breathes");
    }

}
class mamal extends Animal{
    int legs;
}
class dog extends mamal{
    String bread;
}*/


// derived class 
//SINGLE LEVEL INHERITANCE
/*class Fish extends Animal{
    int fines ;
    void swim(){
        System.out.println("swim in water");
    }
}*/

//HERARICAL INHERITANCE
public class oopsinheritance{
    public static void main(String[] args) {
       fish fis =new fish();
       fis.eat();
       fis.breath();
       Animal ani=new Animal();
       ani.color="black";
       System.out.println(ani.color);

        
    }

}


class Animal{
    String color;
    void eat(){
        System.out.println("eats");
 
    };

    void breath (){
        System.out.println("breathes");
    }

}
class mamal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
    
}
class bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
