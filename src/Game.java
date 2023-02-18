import java.util.Scanner;

public class Game {
    private  int turn;
    private Board board;
    private Player[] players;
    public Game(Board board, Player[] players){
        this.board = board;
        this.players = players;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<2; i++){
            System.out.println("Please, Enter Name: ");
            String st = scanner.next();
            char sym;
            if(i == 0){
                sym = 'X';
            }else{
                sym = 'O';
            }
            players[i] = new Player(st, sym);
        }

        turn = (int)(Math.random()*2);
    }
    public void play_game(){
        while(true){
            board.display_board();
            Move move = players[turn].get_move();
            while(!board.update_board(move, players[turn].getSymbol())){ // continue until valid move
                System.out.println("Not valid Move");
                move = players[turn].get_move();
            }
            if(board.is_winner(players[turn].getSymbol())){
                System.out.println(players[turn].getName() + " Wins!!");
                break;
            }
            if(board.is_draw()){
                System.out.println("Game Draw");
                break;
            }
            turn = (turn + 1) % 2;
        }
    }
}
