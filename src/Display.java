import javax.swing.*;
import java.awt.*;

public class Display extends JLabel {
    private JLabel display;
    private static boolean has_dot=false;

    public boolean dotOnScreen(){return has_dot;}

    public void dotSetter(boolean val){has_dot=val;}

    public void updateDisplay(StringBuffer buff)
    {
        display.setText(buff.toString());
    }

    public void clean()
    {
        has_dot=false;
        display.setText("");
    }


    public Display() {
        this.display = new JLabel("");
        this.display.setFocusable(false);
        this.display.setFont(new Font("Helvetica", Font.BOLD, 14));
        this.display.setBounds(35, 25, 400, 50);
        this.display.setOpaque(true);
        this.display.setBackground(Color.decode("#1F456E"));
        this.display.setHorizontalAlignment(SwingConstants.RIGHT);
        this.display.setForeground(Color.decode("#FAFAFA"));
    }

    public JLabel getDisplay() {
        return this.display;
    }
}

