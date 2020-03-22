package training.aspectexception;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
public class DatabaseServiceImpl implements DatabaseService {

    @Override
    public void saveData() {
        System.out.println("I'm trying to save data...");
        System.out.println("Oops! This didn't work. Throwing Exception");
        throw new DatabaseRuntimeException("DB_EXCEPTION");
    }
}
