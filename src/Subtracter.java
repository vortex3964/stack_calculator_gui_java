import java.util.Stack;

public class Subtracter extends Operator{
    private Stack<Double> st;
    public Subtracter(Stack<Double> st){this.st=st;}
    public void operate()
    {
        if(this.notEmpty(st))
        {
            st.push((-st.pop()+st.pop()));
            this.Success(st);
        }
        else this.exceptionMessage();
    }
}
