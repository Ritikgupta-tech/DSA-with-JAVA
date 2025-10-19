/*public class Oops{
   /* public static void main(String[] args) {
        Pen p1=new Pen();// created a pen obj called p1
        p1.setColor("blue");
        System.err.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Bankaccount myAcc=new Bankaccount();
        myAcc.username="ritik";
        myAcc.setPassword("342");

    }

}

class Bankaccount{
    public String username;
    private String passwaord;
    public void  setPassword(String pwd){
        passwaord=pwd;
    }
}

class Pen{
    // PROP +FUN
    String color ;
    int tip;

    void setColor(String newColor){
        color =newColor;

    }
    void setTip(int newTip){
        tip =newTip;
    }
}



public static void main(String[] args) {
        Pen p1=new Pen();// created a pen obj called p1
        p1.setColor("blue");
        System.err.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

    }

}

class Pen{
    // PROP +FUN
    private String color ;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color =newColor;

    }
    void setTip(int newTip){
        tip =newTip;
    }
}*/



/*public class Oops{  // parametrised constructor
    public static void main(String[] args) {
        Student s1=new Student ("ritik ");
        System.out.println(s1.name);
    }
}
class Student {
    String name;
    int roll;
    Student (String name){
        this.name =name;
    }
}*/



/*public class Oops{  //  Non -parametrised constructor
    public static void main(String[] args) {
        Student s1=new Student ();
    }
}
class Student {
    String name;
    int roll;
    Student (){
        System.out.println("constructor isd called");
        
    }
}*/



/*public class Oops{ 
    public static void main(String[] args) {
        Student s1=new Student ();  //non paramiterised
        Student s2 = new Student("ritik"); //paramiterised 
        Student s3 = new Student(123);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}
class Student {
    String name;
    int roll;
    Student (){
        System.out.println("constructor isd called");
        
    }
    Student(String name){
        this.name =name;
    }
    Student(int roll ){
        this.roll=roll;
    }

}*/


/*public class Oops{   // copy constructor
    public static void main(String[] args) {
        Student s1=new Student (); 
        
        s1.name="ritik";
        s1.roll =456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=10;
        s1.marks[2]=1000;

       /* Student s2=new Student(s1); //copy construtor
        s2.password="xyz";
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
            
        }*/


        /*Student s2=new Student(s1); //salow constructor
       
        s2.password="xyz";
        s1.marks[2]=100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
            
        }

        

    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];

// shallow copy constructor
    /*Student(Student s1){
        marks =new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }*/


    // deep copy constructor
   /* Student(Student s1){
        marks =new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for (int i = 0; i <marks.length; i++) {
            this.marks[i]=s1.marks[i];
            
        }

    }
    Student (){
        System.out.println("constructor isd called");
        
    }
    Student(String name){
        this.name =name;
    }
    Student(int roll ){
        this.roll=roll;
    }
}*/


// distructor



 
