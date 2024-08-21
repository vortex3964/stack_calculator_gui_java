import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CsHandler implements ActionListener {
    private Operand op;
    private Display d;
    public CsHandler(Operand op,Display d){
        this.op=op;
    this.d=d;}
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button=(JButton) e.getSource();
        switch(button.getText())
        {
            case "CE":
                op.reset();
                break;
            case "C":
                op.erase();
                break;
        }
        d.clean();
    }
}
