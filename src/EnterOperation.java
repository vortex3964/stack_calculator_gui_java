import javax.swing.*;
import java.awt.*;

public class EnterOperation extends Button {
    private JButton enter;
    public EnterOperation()
    {
        enter=new JButton("enter");
        enter.setFocusable(false);
        enter.setFont(new Font("Helvetica",Font.BOLD,12));
        enter.setBackground(Color.decode("#9146FF"));
    }

    public JButton getEnter() {
        return this.enter;
    }
}
