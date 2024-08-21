import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DigitButton extends Button {

    private JButton button;
    public DigitButton(String name)
    {
        this.button=new JButton();
        this.button.setText(name);
        this.button.setFont(new Font("Helvetica",Font.PLAIN,12));
        this.button.setBackground(Color.decode("#FFD700"));
        this.button.setFocusable(false);
    }
    public JButton getbutton(){return this.button;}

}

