
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListt{
    public static void swap( ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String []args){
        //java collection framwork
        // classname objectname=new classname
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list1=new ArrayList<>();
        ArrayList<Boolean>list2=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);

        System.out.println(list);

        // get opreation -O(1)
        int element=list.get(2);
        System.out.println(element);

        //delete 
        list.remove(3);
        System.out.println(list);

        //set 
        list.set(3, 5);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // size
        System.out.println(list.size());

        // print the aaray list
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i)+" ");
            
        }
        System.out.println();
        //reverse print 
    for(int i=list.size()-1;i>=0; i--){
        System.out.println(list.get(i)+" ");
    }
    System.out.println();

    // maximum value  o(n) =tc
    int max =Integer.MIN_VALUE;
    for (int i = 0; i <list.size(); i++) {
        if (max<list.get(i)) {
            max=list.get(i);
            
        }
        //or
        max=Math.max(max, list.get(i));
        
    }
    System.out.println(max+"max element ");

    // swap to number 
    int idx1=1,indx2=3;
    System.out.println(list);
    swap(list, idx1, indx2);
    System.out.println(list);

    // sort 
    Collections.sort(list); //assending
    System.out.println(list);

    //desending order
    Collections.sort(list,Collections.reverseOrder());
    //comparaotr -fnx logic here defing sorting logic 
    System.out.println(list);

        
    }

    
}