package repl;

import java.io.*;
import repl.IPythonREPL;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");

        IPythonREPL repl = new IPythonREPL();
        repl.run();
    }
}
