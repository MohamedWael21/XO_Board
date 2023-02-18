public class Move {
    private int row;
    private int col;

    public Move(int x, int y){
        this.row = x;
        this.col = y;
    }

    public int get_row(){
        return row;
    }

    public int get_col(){
        return col;
    }
}
