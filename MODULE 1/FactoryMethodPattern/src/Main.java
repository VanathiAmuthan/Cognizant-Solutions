public class Main {
    public static void main(String[] args) {

        // 🎯 Word Document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open(); // should print: Opening a Word Document 📄

        // 🎯 PDF Document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open(); // should print: Opening a PDF Document 📕

        // 🎯 Excel Document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open(); // should print: Opening an Excel Document 📊
    }
}
