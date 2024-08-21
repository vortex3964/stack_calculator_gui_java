import java.util.Stack;

abstract class Operator {

    abstract void operate();

    protected boolean notEmpty(Stack<Double> st)
    {
        double num1;

        if(!st.isEmpty())  num1=st.pop();
        else return false;

        if(!st.isEmpty())
        {
            st.push(num1);
            return true;
        }
        else
        {
            st.push(num1);
            return false;
        }
    }

    protected void exceptionMessage()
    {
        System.out.println("the Stack is empty");
    }

    protected void Success(Stack<Double> st)
    {
        System.out.println("operation completed successfully res is:"+st.peek());
    }
}
