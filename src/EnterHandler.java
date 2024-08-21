import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterHandler implements ActionListener {
    private Operand enter;
    private Display display;

   public EnterHandler(Operand enter,Display display){
       this.enter=enter;
       this.display=display;
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        enter.complete();
        display.clean();
    }
}
