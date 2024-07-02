// File name: DrawOval.java

// Written by: Jonpaul Addorisio
 
// Description: A program that draws out an oval or circle based on user
//              input and allows the user to change its color.
//              
//              
// Challenges: having to organize the code into seprate 
//
// Time Spent: 30 min

// Revision History:
// Date:         		By:      Action:
// ---------------------------------------------------
/* 11/14/2017                   JA      Created                       
 *

 *                      
 * 
 *                        
*/  
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import static javax.swing.JColorChooser.showDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class DrawOval extends JFrame {
    public int x, y, height, width;
    public Color color = Color.LIGHT_GRAY;
    JPanel ovalPanel;
    
    
    
    
    public DrawOval(int x, int y, int height, int width){
        this.ovalPanel = new JPanel(new BorderLayout()){
        //Sets oval with default color and paints to panel
        @Override
        public void paint(Graphics g) {
                super.paint(g);
                
                g.setColor(color);
                g.fillOval(x, y, width, height);
            }
        };
        
        //Creates button to change color 
        JButton changeColor = new JButton("Change Color");
        this.ovalPanel.add(changeColor, BorderLayout.SOUTH);
        
        // Creates action for when button is clicked to open up
        // JColorChooser
        changeColor.addActionListener(
       new ActionListener() 
          {
           
  
            @Override
              public void actionPerformed(ActionEvent e) {
               UtilizeColorPicker();
              
              }
            }); 
    }
    private void UtilizeColorPicker() {
        
        // Opens up the color window for user and repaint
        // oval with corresponding panel
        Color newColor = showDialog(this, "Choose a color", this.color);
        if (newColor == null){
            color = Color.LIGHT_GRAY;
        }
        else{
        color = newColor;
        }
        this.ovalPanel.repaint();
    }
   

    

    private void PanelFrame() {
        
        // Creates the frame/panel for main frame
        this.setTitle("Draw Oval");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(375, 375);
        this.setLocationRelativeTo(null);
        this.add(this.ovalPanel);
        this.setVisible(true);
    }
    public static void main(String args[]){
 
        
        
        // User input of oval values
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter X value"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter Y value"));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter Width value"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter height value"));
      
          
        
                
        
        DrawOval ovalframe = new DrawOval(x,y,height,width);
        ovalframe.PanelFrame();
    
}
}
