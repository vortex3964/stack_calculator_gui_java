import javax.swing.*;
import java.awt.*;

public class OperationButtons extends Button{
    private JButton button;
    public OperationButtons(String name)
    {
        this.button=new JButton(name);
        this.button.setFocusable(false);
        this.button.setBackground(Color.decode("#2AFEB7"));
        this.button.setFont(new Font("Helvetica",Font.BOLD,14));
    }

    public JButton getOp()
    {
        return this.button;
    }

}
