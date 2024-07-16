
interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}public class interfaces2 {
    public static void main(String args[]){
            Queen q= new Queen();
            q.moves();
    
        
    }
}
