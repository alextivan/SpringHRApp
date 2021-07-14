package structural.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        PC computer = new PC();
        Paper paper = new Paper();
        PdfReader pdfReader = new AdapterAsScanner(paper);

        computer.readTextFromDocument(pdfReader);
        System.out.println(computer.getTextFromDoc());

    }
}
