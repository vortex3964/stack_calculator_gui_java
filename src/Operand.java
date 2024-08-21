

import java.util.Stack;

public class Operand implements Operandif{
    private Stack<Double> st;
    private StringBuffer buff;

    public Operand(Stack<Double> stack)
    {
        this.st = stack;
        this.buff = new StringBuffer();
    }
    public StringBuffer GetVal()
    {
        return  buff;
    }

    public void addDigit(char digit)
    {
        buff.append(digit);
        GetVal();
    }

    public void complete() {
        if (!buff.isEmpty()){
            this.st.push(Double.parseDouble(buff.toString()));
        this.erase();
        System.out.println("************");
        System.out.println(st);
        }
    }

    public void  deleteLastDigit()
    {

        if(!this.buff.isEmpty())
        {
            char character=this.buff.charAt(buff.length()-1);
            this.buff.deleteCharAt(this.buff.length()-1);
            if(character=='.')  new Display().dotSetter(false);
        }
    }

    public void erase()
    {
        this.buff.setLength(0);
    }


    public void reset() {
        this.erase();
        this.st.clear();
    }
}
