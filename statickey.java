public class statickey{
    public static void main(String[] args) {
        student s1=new student();
        s1.schoolname="kipm";
         student s2=new student();
         System.out.println(s2.schoolname);
        
    }
}

class student{
    static int returncgpa(int math ,int phy ,int che){
        return (math+phy+che)/3;
    }
    String name;
    int roll;

    static String schoolname;

    void setname(String name){
        this.name=name;
    }
     String getname(){
        return this.name;
    }
}