
package cours.ExceptionClass;

public class MetierException extends RuntimeException{

    public MetierException() {
        this(null,null);
    }

    public MetierException(String message) {
        this(message,null);
    }

    public MetierException(String message, Throwable cause) {
        super(message, cause);
    }

    public MetierException(Throwable cause) {
        this(null,cause);
    }  
}
