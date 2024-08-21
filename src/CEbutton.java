import javax.swing.*;
import java.awt.*;

public class CEbutton extends JButton {
    private JButton ce;
    public CEbutton()
    {
        this.ce=new JButton("CE");
        this.ce.setFont(new Font("Helvetica",Font.PLAIN,12));
        this.ce.setBackground(Color.decode("#0082CB"));
        this.ce.setFocusable(false);
        this.ce.setForeground(Color.decode("#FBFAF5"));
    }
    public JButton getCe(){return this.ce;}
}
