import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class OperationButtonListener implements ActionListener {
    private Adder adder;
    private Subtracter subtracter;
    private Multiplier multiplier;
    private Divider divider;
    private ResultPresenter resultPresenter;
    private Display display;

    public OperationButtonListener(Adder adder, Subtracter subtracter, Multiplier multiplier, Divider divider, ResultPresenter resultPresenter,Display display) {
        this.adder = adder;
        this.subtracter = subtracter;
        this.multiplier = multiplier;
        this.divider = divider;
        this.resultPresenter = resultPresenter;
        this.display=display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source=(JButton) e.getSource();
        StringBuffer captured;
        //change output stream
        ByteArrayOutputStream temp = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream ptemp=new PrintStream(temp);
        System.setOut(ptemp);

        //
        switch(source.getText())
        {
            case "+":
                this.adder.operate();
                this.display.clean();
                break;
            case "-":
                this.subtracter.operate();
                this.display.clean();
                break;
            case "*":
                this.multiplier.operate();
                this.display.clean();
                break;
            case "/":
                this.divider.operate();
                this.display.clean();
                break;
            case "=":
                this.resultPresenter.operate();
                break;
            default:
                System.out.println("invalid");
                break;

        }
        captured=new StringBuffer(temp.toString());
        display.updateDisplay(captured);
        // change back
        System.out.flush();
        System.setOut(originalOut);
    }
}
