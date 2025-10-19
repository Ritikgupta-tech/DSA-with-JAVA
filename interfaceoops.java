public class interfaceoops{
    public static void main (String[]args){
        bear b=new bear();
        b.grass();
        b.chiken();
        //queen q=new queen();
        //q.moves();

    }
}

/*interface ChesPlayer{
    void moves();
}

class queen implements ChesPlayer{
    public void moves(){
        System.out.println("up,down,left,right(in all direction )");
    }
}

class king implements ChesPlayer{
    public void moves(){
        System.out.println("up,down,left,right,(in one steps )");
    }
}

class Rook implements ChesPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}*/

interface herbivore{
    void grass();
}

interface carivore{
    void chiken();
}

class bear implements herbivore,carivore{
    public void grass(){
        System.out.println("eat grass ");
    }
    public void chiken(){
        System.out.println("eat chiken");
    }
}