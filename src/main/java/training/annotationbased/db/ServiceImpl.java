package training.annotationbased.db;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Arsen Adzhiametov on 09-Jun-14 in IntelliJ IDEA.
 */
@Service
public class ServiceImpl implements DbService {

    @Db(DbType.ORACLE)
    private Dao dao;

    @Override
    @PostConstruct
    public void doWork() {
        System.out.print("I'm service. I use ");
        dao.crud();
    }
}
