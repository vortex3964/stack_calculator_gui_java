import javax.swing.*;
import java.awt.*;

public class Cbutton extends JButton {
    private JButton c;
    public Cbutton()
    {
        this.c=new JButton("C");
        this.c.setFont(new Font("Helvetica",Font.PLAIN,12));
        this.c.setBackground(Color.decode("#0082CB"));
        this.c.setFocusable(false);
        this.c.setForeground(Color.decode("#FBFAF5"));
    }
    public JButton getC(){return this.c;}
}
