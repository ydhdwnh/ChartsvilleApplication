/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartsvilleapplication;
import javax.swing.UIManager;

/**
 *
 * @author TimW
 */
public class ChartsvilleApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        try {

        UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(ChartsvilleApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        javax.swing.LookAndFeel x = UIManager.getLookAndFeel();
        CVMain cvMain = new CVMain();
        cvMain.setTitle("Chartsville Music Charts");
        cvMain.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        cvMain.setVisible(true);
    }
    
}
