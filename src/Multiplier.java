import java.util.Stack;

public class Multiplier extends Operator{
    private Stack<Double> st;
    public Multiplier(Stack<Double> st){this.st=st;}

    public void operate()
    {
        if(this.notEmpty(st)){
            st.push((st.pop()*st.pop()));
            this.Success(st);
        }
        else this.exceptionMessage();
    }
}
