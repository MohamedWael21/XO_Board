public class XO_Board extends Board{

    public XO_Board(int sz){
        super(sz);
    }
    @Override
    public void display_board() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(" " + grid[i][0] + " | " + grid[i][1] + " | " + grid[i][2]);
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
        System.out.println();
    }

    @Override
    public boolean is_winner(char symbol) {
        for(int i=0; i<size; i++){ // row and col
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) {
                return true;
            }
            if (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) {
                return true;
            }
         }
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) { // main diagonal
            return true;
        }
        if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) { // cross diagonal
            return true;
        }
        return false;
    }

    private  boolean isFull(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(grid[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public boolean is_draw() {
        return isFull();
    }


}
