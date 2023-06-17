
package Juegoo;


import java.lang.reflect.Field;
import javax.swing.JPanel;


public class Contenedor extends JPanel{
    
    pSnakeGame snake;
    GameOverSNAKE gameover;
    private static int panelActivo = 0;
    

    public Contenedor() {
        this.snake = new pSnakeGame();
        this.gameover = new GameOverSNAKE();
        this.add(snake);
        this.add(gameover);
    } 

    public static int getPanelActivo() {
        return panelActivo;
    }
    
    public static void cambiaValor(int nuevoValor) {
        try {
            Field field = Contenedor.class.getDeclaredField("panelActivo");
            field.setAccessible(true);
            field.setInt(null, nuevoValor);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e) {
            System.out.println("No se pudo cambiar el valor :(");
            e.printStackTrace(System.out);
        }
    }
}
