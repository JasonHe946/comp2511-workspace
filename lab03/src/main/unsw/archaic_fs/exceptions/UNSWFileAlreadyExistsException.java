package unsw.archaic_fs.exceptions;

public class UNSWFileAlreadyExistsException extends java.io.FileNotFoundException{
    

    public UNSWFileAlreadyExistsException(String File) {
        super(File);
    }

}
