package repl;

import java.lang.*;
import java.io.*;
import java.util.*;

public class IPythonREPL extends BaseREPL {
    public IPythonREPL() {
        super();
        System.out.println("Repple Wepple");
        replBuilder = new ProcessBuilder("ls");
    }

    public void run() throws IOException {
        Process proc = replBuilder.start();
        BufferedReader stdin = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String s = null;
        while ((s = stdin.readLine()) != null)
            System.out.println(s);
    }

}
