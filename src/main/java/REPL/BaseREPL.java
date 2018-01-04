package REPL;
public abstract class BaseREPL {

    private ProcessBuilder replProc;
    
    public BaseREPL() {};

    abstract  void initRepl();

    
}
