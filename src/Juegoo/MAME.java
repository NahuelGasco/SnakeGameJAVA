
package Juegoo;


import javax.swing.JFrame;



public class MAME extends JFrame {
   
    Contenedor contenedor = new Contenedor();   
    
    public MAME(){
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(contenedor.getComponent(Contenedor.getPanelActivo()));
        System.out.println(Contenedor.getPanelActivo());
        this.pack();       
        this.setLocationRelativeTo(null);
        this.setVisible(true);   
    }
    
}
