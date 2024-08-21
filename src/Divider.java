import java.util.Stack;

public class Divider extends Operator{
    private Stack<Double> st;
    public Divider(Stack<Double> st){this.st=st;}

    public void operate()
    {
        if(this.notEmpty(st)) {
            double temp = st.peek();
            if (temp == 0) {
                System.out.println("Attempt to divide by zero");
            }
            else
            {
                st.pop();
                st.push((st.pop() / temp));
                this.Success(st);
            }

        }
        else this.exceptionMessage();
    }

}
