

import javax.swing.*;
import java.awt.*;

public class CalculatorGui extends Frame {
    private static final int DIGITS=10;

    public CalculatorGui(String title,Operand operand,Adder adder,Subtracter subtracter,Multiplier multiplier,Divider divider,ResultPresenter rp)
   {
       //frame characteristics
      ImageIcon image=new ImageIcon("icon.png");
      JFrame frame=new JFrame(title);
      frame.setSize(480,450);
      frame.setLocation(40,80);
      frame.setFont(new Font("Helvetica", Font.PLAIN, 14));
      frame.getContentPane().setBackground(Color.decode("#B11313"));
      frame.setResizable(false);
      frame.setLayout(null);
      frame.setIconImage(image.getImage());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //

      //create display
      Display display=new Display();
      frame.getContentPane().add(display.getDisplay());
      //

      //create digit panel
      JPanel digitpanel=new JPanel();
      digitpanel.setLayout(new GridLayout(4,3,3,3));
      digitpanel.setBounds(25,100,200,300);
      digitpanel.setBackground(Color.decode("#B11313"));
      //create digit buttons and add them to digitpanel
      int i;
       DigitButton[] digb=new DigitButton[DIGITS];
      for(i=0;i<DIGITS;i++) {
         String name = "" + i;
         digb[i] = new DigitButton(name);
         digitpanel.add(digb[i].getbutton());
      }
      DigitButton dotop=new DigitButton(".");


      //add the c/ce
      Cbutton c = new Cbutton();
      digitpanel.add(c.getC());
      CEbutton ce = new CEbutton();
      digitpanel.add(ce.getCe());
      //

      //operation panel creation
      JPanel oppanel=new JPanel();
      oppanel.setLayout(new GridLayout(5,2,3,3));
      oppanel.setBounds(240,100,180,300);
      oppanel.setBackground(Color.decode("#B11313"));
      //


      //add the operations
       OperationButtons add = new OperationButtons("+");
       OperationButtons sub = new OperationButtons("-");
       OperationButtons mul = new OperationButtons("*");
       OperationButtons div = new OperationButtons("/");
       OperationButtons res = new OperationButtons("=");
       OperationButtons dot=new OperationButtons(".");
       oppanel.add(add.getOp());
       EnterOperation enter = new EnterOperation();
       oppanel.add(enter.getEnter());
       oppanel.add(sub.getOp());
       BackspaceOperation back = new BackspaceOperation();
       oppanel.add(back.getBack());
       oppanel.add(mul.getOp());
       oppanel.add(div.getOp());
       oppanel.add(res.getOp());
       oppanel.add(dot.getOp());
      //finish adding them


      //add the new panels
      frame.add(oppanel);
      frame.add(digitpanel);
      frame.setVisible(true);
      //

      //implementing listeners for digits
      DigitButtonListener listener = new DigitButtonListener(operand,display);
      for(i=0;i<DIGITS;i++) {
         digb[i].getbutton().addActionListener(listener);
      }
      //

      //ading action listeners for operations

      OperationButtonListener operate=new OperationButtonListener( adder, subtracter, multiplier, divider, rp,display);
      add.getOp().addActionListener(operate);
      sub.getOp().addActionListener(operate);
      mul.getOp().addActionListener(operate);
      div.getOp().addActionListener(operate);
      res.getOp().addActionListener(operate);
      dot.getOp().addActionListener(listener);

      EnterHandler handle=new EnterHandler(operand,display);
      //action listener for enter
      enter.getEnter().addActionListener(handle);

      //action listener for backspace
      BackspaceHandler b=new BackspaceHandler(operand,display);
      back.getBack().addActionListener(b);

      //CE/C listener
      CsHandler cs=new CsHandler(operand,display);
      c.getC().addActionListener(cs);
      ce.getCe().addActionListener(cs);
   }
}


