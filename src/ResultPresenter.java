import java.util.Stack;

public class ResultPresenter extends Operator {
    private Stack<Double> st;
    public ResultPresenter(Stack<Double> st){this.st=st;}
    public void operate()
    {
        if(!st.isEmpty())
        {
            var d=st.pop();
            System.out.println(d);
        }
        else this.exceptionMessage();
    }
}
