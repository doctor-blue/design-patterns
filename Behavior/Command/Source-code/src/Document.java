import java.util.Stack;

public class Document {
    private final Stack<String> lines = new Stack<>();

    public void write(String line){
        lines.push(line);
    }

    public void read(){
        for (String line : lines){
            System.out.println(line);
        }
    }
    public void eraseLast(){
        if (!lines.isEmpty()){
            lines.pop();
        }
    }
}
