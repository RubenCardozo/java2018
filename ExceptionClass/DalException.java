
package cours.ExceptionClass;

public class DalException extends Exception{
    
    
    
    public DalException() {
        super();
    }

    public DalException(String message) {
        super(message);
    }

    public DalException(String message, Throwable cause) {
        super(message, cause);
    }

    public DalException(Throwable cause) {
        super(cause);
    }
    
}
