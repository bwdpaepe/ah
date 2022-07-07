import engine.GameEngine;
import engine.IGameLogic;
import game.GameLoop;
import renderer.Window;

public class Main {
    public static void main(String[] args) {
        try {
            boolean vSync = true;
            IGameLogic gameLogic = new GameLoop();
            GameEngine gameEng = new GameEngine("GAME", 600, 480, vSync, gameLogic);
            gameEng.run();
        } catch (Exception excp) {
            excp.printStackTrace();
            System.exit(-1);
        }
        /*Window window = Window.get();
        window.run();*/
    }
}
