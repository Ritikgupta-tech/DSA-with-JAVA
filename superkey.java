

public class superkey{
    public static void main(String[] args) {
        Animal a=new Animal();
        horse h=new horse();
        
    }
}

class Animal{

    public Animal() {
        System.out.println("animal constructor is called");
    }
    
}
class horse extends Animal{

    public horse() {
        super();
        System.out.println("horse constructor iscalled");
    }
    
}