import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackspaceHandler implements ActionListener {

    private Operand op;
    private Display d;
    public BackspaceHandler(Operand op,Display d)
    {
        this.op=op;
        this.d=d;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.op.deleteLastDigit();
        this.d.updateDisplay(this.op.GetVal());
    }
}
