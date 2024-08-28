// WordDocument.java
public interface WordDocument {
    void create();
}

// PdfDocument.java
public interface PdfDocument {
    void create();
}

// ExcelDocument.java
public interface ExcelDocument {
    void create();
}

// Concrete implementations for Word, PDF, and Excel documents
public class ConcreteWordDocument implements WordDocument {
    @Override
    public void create() {
        System.out.println("Creating Word document...");
        // Add specific logic for Word document creation
    }
}

public class ConcretePdfDocument implements PdfDocument {
    @Override
    public void create() {
        System.out.println("Creating PDF document...");
        // Add specific logic for PDF document creation
    }
}

public class ConcreteExcelDocument implements ExcelDocument {
    @Override
    public void create() {
        System.out.println("Creating Excel document...");
        // Add specific logic for Excel document creation
    }
}

// DocumentFactory.java
public abstract class DocumentFactory {
    public abstract WordDocument createWordDocument();
    public abstract PdfDocument createPdfDocument();
    public abstract ExcelDocument createExcelDocument();
}

// Concrete factory for Word documents
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public WordDocument createWordDocument() {
        return new ConcreteWordDocument();
    }

    @Override
    public PdfDocument createPdfDocument() {
        return new ConcretePdfDocument();
    }

    @Override
    public ExcelDocument createExcelDocument() {
        return new ConcreteExcelDocument();
    }
}

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new WordDocumentFactory();
        WordDocument wordDoc = factory.createWordDocument();
        wordDoc.create();
    }
}
