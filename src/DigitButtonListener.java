import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitButtonListener implements ActionListener
{
    private  Operand operand;
    private  Display display;

    public DigitButtonListener( Operand op,Display display) {
        this.operand = op;
        this.display=display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source=(JButton)e.getSource();
        if (source.getText().equals("."))
        {
            if(!operand.GetVal().isEmpty())
            {
                if(!display.dotOnScreen())
                {
                    operand.addDigit(source.getText().charAt(0));
                    display.updateDisplay(operand.GetVal());
                    display.dotSetter(true);
                }
                else
                {
                    StringBuffer buff=new StringBuffer("cant put dot there");
                    display.updateDisplay(buff);
                }

            }
            else
            {
                StringBuffer buff=new StringBuffer("cant put dot on an empty schreen");
                display.updateDisplay(buff);
            }
        }
        else
        {
            operand.addDigit(source.getText().charAt(0));
            display.updateDisplay(operand.GetVal());
        }
    }
}
