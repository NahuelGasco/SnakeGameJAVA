
package Juegoo;


import javax.swing.JFrame;



public class MAME extends JFrame {
   
   pSnakeGame snake;
   GameOverSNAKE gameOverSNAKE = new GameOverSNAKE();
    
    public MAME(){
        this.snake = new pSnakeGame(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(snake);
        this.pack();       
        this.setLocationRelativeTo(null);
        this.setVisible(true);   
        
    }
    
    public void cambiarpanel(){
    
        this.add(gameOverSNAKE);
        this.pack();       
        this.setLocationRelativeTo(null);
        this.setVisible(true);   
    }
    
}
