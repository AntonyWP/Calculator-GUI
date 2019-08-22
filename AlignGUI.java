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
 *  Purpose:        A java program to create a GUI Alignment         *
 *                                                                   *
 ********************************************************************/
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AlignGUI extends JFrame
{
  private JButton Button_ok, Button_cancel, Button_help;
  private JTextField Value_x, Value_y;
  private JCheckBox Box_snaptoGrid, Box_ShowGrid;
  private JLabel Label_x, Label_y;
  private JPanel checkPanel, buttonPanel, fieldPanel, fieldPanel1, fieldPanel2;
  
  // Align constructor
  public AlignGUI()
  {
    super("Align");
    
    // Build to checkPanel
    Box_snaptoGrid = new JCheckBox ("Snap to Grid");
    Box_snaptoGrid.addActionListener(new ActionListener() 
    { 
      //show if box is checked or unchecked
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        if(Box_snaptoGrid.isSelected()) 
        JOptionPane.showMessageDialog(null, "Snap to Grid box checked");
        else
        JOptionPane.showMessageDialog(null, "Snap to Grid box unchecked");  
      }
    });
    
    Box_ShowGrid = new JCheckBox ("Show Grid");
    Box_ShowGrid.addActionListener(new ActionListener() 
    { 
      //show if Show grid is selected
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        if(Box_ShowGrid.isSelected()) 
        JOptionPane.showMessageDialog(null, "Show Grid box checked");
        else
        JOptionPane.showMessageDialog(null, "Show Grid box unchecked");
      }
    });
    checkPanel = new JPanel();
    checkPanel.setLayout (new GridLayout (2, 1));
    checkPanel.add (Box_snaptoGrid);
    checkPanel.add (Box_ShowGrid);
    
    // Build to button panel
    Button_ok = new JButton ("OK");
    Button_ok.addActionListener(new ActionListener() 
    { 
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        JOptionPane.showMessageDialog(null, "ok button pressed");
      }
    });
    //cancel button
    Button_cancel = new JButton ("Cancel");
    Button_cancel.addActionListener(new ActionListener() 
    { 
      //show if cancel button is pressed
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        JOptionPane.showMessageDialog(null, "cancel button pressed");
      }
    });
    
    //help button
    Button_help = new JButton ("Help");
    Button_help.addActionListener(new ActionListener() 
    { 
      //show if help button is pressed
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        JOptionPane.showMessageDialog(null, "help button pressed");
      }
    });
    
    buttonPanel = new JPanel();
    buttonPanel.setLayout (new GridLayout (3, 1, 10, 5));
    buttonPanel.add (Button_ok);
    buttonPanel.add (Button_cancel);
    buttonPanel.add (Button_help);
    
    // Build to fieldPanel
    Label_x = new JLabel ("X: ");
    Value_x = new JTextField ("8", 3);
    Value_x.addActionListener(new ActionListener() 
    { 
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        JOptionPane.showMessageDialog(null, Value_x.getText() + " in text field X");
      }
    });
     
    fieldPanel = new JPanel();
    fieldPanel.setLayout (new FlowLayout());
    fieldPanel.add (Label_x);
    fieldPanel.add (Value_x);
    
    // Build to fieldPanel1
    Label_y = new JLabel ("Y: ");
    Value_y = new JTextField ("8", 3);
    Value_y.addActionListener(new ActionListener() 
    { 
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        JOptionPane.showMessageDialog(null, Value_y.getText() + " in text field Y");
      }
    });
    fieldPanel1 = new JPanel();
    fieldPanel1.setLayout (new FlowLayout());
    fieldPanel1.add (Label_y);
    fieldPanel1.add (Value_y);
    
    // Build to fieldPanel2
    fieldPanel2 = new JPanel();
    fieldPanel2.setLayout (new BorderLayout());
    fieldPanel2.add (fieldPanel, BorderLayout.NORTH);
    fieldPanel2.add (fieldPanel1, BorderLayout.SOUTH);
    
    // setLayout for applet
    Container container = getContentPane();
    container.setLayout (new FlowLayout (FlowLayout.CENTER, 10, 5));
    container.add (checkPanel);
    container.add (fieldPanel2);
    container.add (buttonPanel);
  }
}