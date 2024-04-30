package week8;
public class StackMain {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(15);
        st.push(27);
        st.push(13);
        st.print();
        
        st.push(11);
        st.push(34);
        st.pop();
        st.peek();
        st.print();

        st.push(18);
        st.print();
        st.push(40);
    }
}