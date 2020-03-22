package training.aspectexception;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
public class HighLevelServiceImpl implements HighLevelService {

    private DatabaseService databaseService;

    @Override
    public void doWork() {
        databaseService.saveData();
    }

    public void setDatabaseService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
}
