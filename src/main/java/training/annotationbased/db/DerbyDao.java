package training.annotationbased.db;

/**
 * Created by Arsen Adzhiametov on 09-Jun-14 in IntelliJ IDEA.
 */
@Db(DbType.DERBY)
public class DerbyDao implements Dao {
    @Override
    public void crud() {
        System.out.println("I'm derby dao...");
    }
}
