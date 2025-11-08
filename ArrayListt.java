
import java.util.ArrayList;

public class ArrayListt{
    public static void main(String []args){
        //java collection framwork
        // classname objectname=new classname
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list1=new ArrayList<>();
        ArrayList<Boolean>list2=new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);

        System.out.println(list);

        // get opreation -O(1)
        int element=list.get(2);
        System.out.println(element);

        //delete 
        list.remove(3);
        System.out.println(list);

        //set 
        list.set(2, 10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}