public class SLLMainassignment {
    public static void main(String[] args) {
        singlelinkedlistassigenment singLL = new singlelinkedlistassigenment();
    
        singLL.addFirst("a");
        singLL.addLast("e");
        singLL.insertAt(1, "b");
        singLL.insertAfter("b", "c");
        singLL.insertAfter("c", "d");
        singLL.print();
    }
}
