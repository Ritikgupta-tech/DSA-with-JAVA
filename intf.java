
interface i1{
    void pet();



    
}
interface dog extends i1{
    void sound();

}
class dogesh implements dog{
    public void pet (){
        System.out.println("dog is animal");
    }
    public void sound(){
        System.out.println("barking at night");

    }
}
public class intf{
    public static void main(String[] args) {
        dogesh d=new dogesh();
        d.pet();
        d.sound();
    }
}