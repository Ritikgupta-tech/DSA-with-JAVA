/*public class oopspolymorphism{  //compile time polymorphism 
    public static void main(String[] args) {
        calculater calc =new calculater();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));
        
    }
}
class calculater{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a ,int b,int c){
        return a+b+c;
    }
}*/


//run time polymorphism
public class oopspolymorphism{
    public static void main(String[] args) {
        dear d=new dear();
        d.eat();
        Animal a=new Animal();
        a.eat();
        
    }
}

class Animal {
    void eat(){
        System.out.println("eat any thing ");
    }
}
class dear extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
