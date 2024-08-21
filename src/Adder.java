import java.util.Stack;

public class Adder extends Operator{
    private Stack<Double> st;
    public Adder(Stack<Double> st){
        this.st=st;
    }
    public void operate() {
        if (this.notEmpty(this.st))
        {
            st.push(st.pop() + st.pop());
            this.Success(st);
        }
        else this.exceptionMessage();
    }
}
