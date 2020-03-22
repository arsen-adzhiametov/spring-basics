package training.annotationbased.db;

/**
 * Created by Arsen Adzhiametov on 09-Jun-14 in IntelliJ IDEA.
 */
@Db(DbType.ORACLE)
public class OracleDao implements Dao {
    @Override
    public void crud() {
        System.out.println("I'm oracle dao...");
    }
}
