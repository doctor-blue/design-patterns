public class DocumentEditorCommand implements Command{
    private Document document;
    private String text;

    public DocumentEditorCommand(Document document, String text) {
        this.document = document;
        this.text = text;
        document.write(text);
    }

    @Override
    public void undo() {
        document.eraseLast();
    }

    @Override
    public void redo() {
        document.write(text);
    }
}
