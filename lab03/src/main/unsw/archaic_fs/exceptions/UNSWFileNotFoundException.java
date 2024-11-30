package unsw.archaic_fs.exceptions;

public class UNSWFileNotFoundException extends java.nio.file.FileAlreadyExistsException{

    public UNSWFileNotFoundException(String File) {
        super(File);
    }

}
