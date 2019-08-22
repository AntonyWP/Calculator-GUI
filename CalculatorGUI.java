/*********************************************************************
 *                                                                   *
 *  CSCI 470               Assignment 7           Fall 2018          *
 *                                                                   *
 *  Developer(s):   Antony Pierson                                   *
 *                                                                   *
 *  Section:        1                                                *
 *                                                                   *
 *  Due Date/Time:  11/7/18 11:59p.m.                                *
 *                                                                   *
 *  Purpose:        A java program to create a GUI calculator        *
 *                                                                   *
 ********************************************************************/
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CalculatorGUI extends JFrame
{
  private JButton keys[];
  private JPanel keyPad;
  private JTextField tf;
  
  // Calculator constructor
  public CalculatorGUI()
  {
    super ("Calculator");
    
    tf = new JTextField(20);
    tf.setEditable (true);
    keys = new JButton[16];
    
    //initialize all non-digit key buttons
    for (int i = 0; i <= 9; i++)
    {  
    keys[i] = new JButton (String.valueOf(i));
    
    }
    
    keys[10] = new JButton ("/");
    keys[11] = new JButton ("*");
    keys[12] = new JButton ("-");
    keys[13] = new JButton ("+");
    keys[14] = new JButton ("=");
    keys[15] = new JButton (".");
    for (int i = 0; i <= 15; i++)
    {
    keys[i].addActionListener(new ActionListener() 
    { 
      //show whatever button pressed
      @Override
      public void actionPerformed(ActionEvent e) 
      {
         JOptionPane.showMessageDialog(null, ((JButton)e.getSource()).getText() + " button pressed");
      }
    });
    }
    
    //set keyPad layout to GridLayout
    keyPad = new JPanel();
    keyPad.setLayout(new GridLayout (4, 4));
    
    // add buttons 7, 8, 9 and divide to keypad
    for (int i = 7; i <= 10; i++)
    keyPad.add(keys[i]);
    
    // buttons 4, 5, 6
    for (int i = 4; i <= 6; i++)
    keyPad.add(keys[i]);
    
    // multiply
    keyPad.add(keys[11]);
    
    // buttons 1, 2, 3
    for (int i = 1; i <= 3; i++)
    keyPad.add(keys[i]);
    
    // Subtract
    keyPad.add(keys[12]);
    keyPad.add(keys[0]);
    for (int i = 15; i >= 13; i--)
    keyPad.add(keys[i]);
    
    //add components to BorderLayout
    Container container = getContentPane();
    container.add (tf, BorderLayout.NORTH);
    container.add (keyPad, BorderLayout.CENTER);
    
    tf.addActionListener(new ActionListener() 
    { 
      //show texted that was entered
      @Override
      public void actionPerformed(ActionEvent e) 
      {
         JOptionPane.showMessageDialog(null, tf.getText() + " Entered in text field");
      }
    });
  }
}