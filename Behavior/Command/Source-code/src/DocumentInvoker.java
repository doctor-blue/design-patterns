import java.util.Stack;

public class DocumentInvoker {
    private Stack<Command> undoCommands = new Stack<>();
    private Stack<Command> redoCommands = new Stack<>();
    private Document document = new Document();

    public void undo(){
        if (!undoCommands.isEmpty()){
           Command cmd = undoCommands.pop();
           cmd.undo();
           redoCommands.push(cmd);

        }else {
            System.out.println("Nothing to undo");
        }
    }
    public void redo(){
        if (!redoCommands.isEmpty()){
            Command cmd = redoCommands.pop();
            cmd.redo();
            undoCommands.push(cmd);
        }else {
            System.out.println("Nothing to redo");
        }
    }

    public void write(String text){
        Command cmd = new DocumentEditorCommand(document,text);
        undoCommands.push(cmd);
        redoCommands.clear();
    }
    public void read(){
        document.read();
    }
}
