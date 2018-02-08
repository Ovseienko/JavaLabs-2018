import java.util.Stack;

public class StringsStack {
    public Stack<String> strings = new Stack<>();
    public int stackSize;

    public void getStackLenght() {
        stackSize = strings.size();
        System.out.println(stackSize);
    }

    public void pushToStrings(String str) {
        strings.push(str);
    }

    public void popFromStrings() {
        strings.pop();
    }
}
