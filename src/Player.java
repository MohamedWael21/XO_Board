import java.awt.*;
import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    public Player(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }
    public Move get_move(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + " " + symbol +" Please, Enter Row");
        int x = scanner.nextInt();
        System.out.println(name + " " + symbol +" Please, Enter Column");
        int y = scanner.nextInt();
        return  new Move(x, y);
    }
    public String getName(){
        return name;
    }

    public  char getSymbol(){
        return symbol;
    }

}
