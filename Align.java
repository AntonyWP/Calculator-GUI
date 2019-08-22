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
import javax.swing.JFrame;
public class Align extends JFrame
{
public static void main (String args[])
  {
    AlignGUI alignGUI = new AlignGUI();
    alignGUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    alignGUI.setSize(300, 125);
    alignGUI.setVisible(true);
  }
}