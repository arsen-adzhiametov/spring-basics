package training.aspectexception;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
public class DatabaseRuntimeException extends RuntimeException {
    public DatabaseRuntimeException(String message) {
        super(message);
    }
}
