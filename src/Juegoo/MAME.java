
package Juegoo;

import PingPong.*;
import java.awt.Color;
import javax.swing.JFrame;



public class MAME extends JFrame {
    
    pSnakeGame snake = new pSnakeGame(this);
    GameOverSNAKE gameover = new GameOverSNAKE(this);
    pPong juegoPing = new pPong(this);
    
    public MAME(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(juegoPing);
        juegoPing.initPong();
        this.pack();       
        this.setLocationRelativeTo(null);
        this.setBackground(Color.BLACK);
        this.setVisible(true);   
        
    }
    
    public void cambiarpanelGameOver(){
       
        this.add(gameover);   
        gameover.setVisible(true);
        gameover.requestFocus();
    }
    
     public void cambiarpanelJuegoSnake(){
        
        this.add(snake);
        snake.initJuego();
        snake.setJugando(true);
        snake.setVisible(true);
        snake.requestFocus();
         
    }
     
     public void cambiarpanelJuegoPong(){
        
        this.add(juegoPing);
        juegoPing.initPong();
        juegoPing.setVisible(true);
        juegoPing.requestFocus();
         
    }
    
}
