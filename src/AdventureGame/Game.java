package AdventureGame;
import java.util.Scanner;

public class Game {
    private Player player;


    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The journey begins... Are you ready to face your destiny?");
        System.out.println("Enter your character's name:");
        String name = scanner.nextLine();
        player = new Player(name);
        player.selectChar(player);
        player.selectLocation(player);




    }

}
