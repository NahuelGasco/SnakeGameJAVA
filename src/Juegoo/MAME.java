
package Juegoo;


import javax.swing.JFrame;



public class MAME extends JFrame {
    
    pSnakeGame snake = new pSnakeGame(this);
    GameOverSNAKE gameover = new GameOverSNAKE(this);
   
    public MAME(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(snake);
        snake.initJuego();
        this.pack();       
        this.setLocationRelativeTo(null);
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
    
}
