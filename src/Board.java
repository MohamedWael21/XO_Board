abstract public class Board {
    protected int size;
    protected char grid[][];
    public Board(int sz){
        size = sz;
        grid = new char[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                grid[i][j] = '-';
            }
        }
    }
    public abstract void display_board();
    public  abstract boolean is_winner(char symbol);

    public  abstract  boolean is_draw();

    public boolean update_board(Move move, char symbol){
        if(isValidMove(move)){
            grid[move.get_row()-1][move.get_col()-1] = symbol;
            return true;
        }
        return  false;
    }

    private boolean isValidMove(Move move){
        if(move.get_row() <= 0 || move.get_row() > size){
            return false;
        }
        if(move.get_col() <= 0 || move.get_col() > size){
            return false;
        }
        return grid[move.get_row()-1][move.get_col()-1] == '-';
    }


}
