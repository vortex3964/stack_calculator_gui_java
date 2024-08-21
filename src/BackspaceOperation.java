import javax.swing.*;
import java.awt.*;

public class BackspaceOperation extends Button {
    private JButton back;
    public BackspaceOperation()
    {
        back=new JButton("backspace");
        back.setFocusable(false);
        back.setFont(new Font("Helvetica",Font.BOLD,12));
        back.setBackground(Color.decode("#9146FF"));
    }
    public JButton getBack(){return this.back;}
}
