import java.util.Stack;

public class CalculatorGuiApp {
    public static  void main(String[] args)
    {
        Stack<Double> st=new Stack<Double>();
        Operand op=new Operand(st);
        Adder add=new Adder(st);
        Subtracter sub=new Subtracter(st);
        Multiplier mul=new Multiplier(st);
        Divider div=new Divider(st);
        ResultPresenter rp=new ResultPresenter(st);
        CalculatorGui gui=new CalculatorGui("Rpn calculator",op,add,sub,mul,div,rp);
    }
}
