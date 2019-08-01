import java.io.Reader;
import java.util.*;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class B2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String input = "4+5*3-2";
        String input = in.nextLine();
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            Object output = engine.eval(input);
            System.out.println(output);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        in.close();
    }
}