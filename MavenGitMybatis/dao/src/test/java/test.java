import edu.hust.dao.IAccountDao;
import edu.hust.dao.IRoleDao;
import edu.hust.dao.IUserDao;
import edu.hust.domain.Account;
import edu.hust.domain.Role;
import edu.hust.domain.User;
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
    private IUserDao userDao;


    private IRoleDao roleDao;
    @Test
    public void findAll() {
//        List<AccountUser> accounts = accountDao.findAll();
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account.toString());
            System.out.println(account.getUser().toString());
            System.out.println("--------------");
        }
    }


    @Test
    public void findUser() {
        List<User> u = userDao.findAll();
        for (User user : u) {
            System.out.println(user.toString());
            for (Account account : user.getAccounts()) {
                System.out.println(account.toString());
            }
            System.out.println("-----------------");
        }
    }


    @Test
    public void findRole() {
        List<Role> roles = roleDao.findAll();
        for (Role role : roles) {
            System.out.println(role.toString());
            for (User user : role.getUsers()) {
                System.out.println(user.toString());
            }
            System.out.println("--------------");
        }
    }


    @Test
    public void findUserRole() {
        List<User> users = userDao.findAllRole();
        for (User user : users) {
            System.out.println(user);
            for (Role role : user.getRoles()) {
                System.out.println(role);

            }
            System.out.println("0-----------------");
        }
    }




    @Test
    public void findUserRoleById() {
        User user= userDao.findById(41);
            System.out.println(user);
            for (Role role : user.getRoles()) {
                System.out.println(role);
            }
    }

    @Before
    public void Init() throws IOException {
        in = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession(true);
//        System.out.println(sqlSession);
        //4.获取dao的代理对象
//        accountDao = sqlSession.getMapper(IAccountDao.class);
        userDao = sqlSession.getMapper(IUserDao.class);
//        roleDao = sqlSession.getMapper(IRoleDao.class);


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
