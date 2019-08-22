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
import javax.swing.JFrame;
public class Calculator extends JFrame
{
public static void main (String args[])
  {
    CalculatorGUI calculatorGUI = new CalculatorGUI();
    calculatorGUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    calculatorGUI.setSize(200, 200);
    calculatorGUI.setVisible(true);
  }
}