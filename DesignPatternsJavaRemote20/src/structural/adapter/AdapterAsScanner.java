package structural.adapter;

public class AdapterAsScanner implements PdfReader{

    private Paper newPaper;

    public AdapterAsScanner(Paper newPaper) {
        this.newPaper = newPaper;
    }

    @Override
    public String readPdfDocument() {
        return newPaper.getText();
    }
}
