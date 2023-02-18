public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[2];
        Board board = new XO_Board(3);
        Game game = new Game(board, players);
        game.play_game();
    }
}