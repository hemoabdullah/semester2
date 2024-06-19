
public class Stack {
    singlelinkedlistassigenment singLL = new singlelinkedlistassigenment();

    public void push(String data) {
        singLL.addFirst(data);
    }

    public String pop() {
        String data = singLL.getData(0);
        singLL.removeFirst();
        return data;
    }

    public void print() {
        singLL.print();
    }
}
