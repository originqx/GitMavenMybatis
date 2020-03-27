import edu.hust.dao.IAccountDao;
import edu.hust.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: QX
 * @Date: 2020/3/27 17:07
 * @Version 1.0
 */
public class test {

    private InputStream in;
    private SqlSession sqlSession;
    private IAccountDao accountDao;
    @Test
    public void findAll() {
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            account.toString();
        }
    }


    @Before
    public void Init() throws IOException {
        in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(in);
        sqlSession = build.openSession();
        accountDao = sqlSession.getMapper(IAccountDao.class);
    }

    @After
    public void destory() throws IOException {
        sqlSession.commit();
        if (in != null) {
            in.close();
        }
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
