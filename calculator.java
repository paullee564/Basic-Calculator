import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
   import javax.swing.BorderFactory;
   

public class calculator extends JPanel
{
   private JButton [][] board;
   private int [][] matrix;
   private JButton reset;
   private JLabel window;
   private Color blue = Color.decode("#372387");
   
   private JButton one;
   private JButton two;
   private JButton three;
   private JButton four;
   private JButton five;
   private JButton six;
   private JButton seven;
   private JButton eight;
   private JButton nine;
   private JButton zero;
   private JButton multiply;
   private JButton remainder;
   private JButton add;
   private JButton subtract;
   private JButton divide;
   private JButton clear;
   private JButton enter;
   private JButton period;
   private JButton equal;
  
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Calculator");
      frame.setSize(400,600);
      frame.setLocation(200,100);
      frame.setContentPane(new calculator());
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
   
   public calculator()
   {
      setLayout(new BorderLayout());
      
      
      window = new JLabel("input",SwingConstants.RIGHT);
      window.setPreferredSize(new Dimension(200, 100));
      window.setBackground(Color.white);
      window.setOpaque(true);
      window.setFont(new Font("Calculator", Font.BOLD, 50));
      Border border = BorderFactory.createLineBorder(blue, 12);
      window.setBorder(border);
      add(window, BorderLayout.NORTH);
     
      Border border1 = BorderFactory.createLineBorder(blue, 8);
      JPanel buttons = new JPanel();
      buttons.setSize(300, 500);
      buttons.setBackground(blue);
      buttons.setLayout(new GridLayout(4,5));
      add(buttons, BorderLayout.CENTER);
      board = new JButton[4][5];
      matrix = new int[4][5];
      
      
         
      
    
   }

}