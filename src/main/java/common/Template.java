package common;

import leeeunsook.ManagerMapper;
import leehojun.common.EmployeeMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Template {

    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost/employee";
    private static String user = "ohgiraffers";
    private static String pass= "ohgiraffers";

    private static SqlSessionFactory sf;

    public static SqlSession getSqlSession(){
        if(sf==null){
            Environment e = new Environment("dev",new JdbcTransactionFactory(),new PooledDataSource(driver,url,user,pass));
            Configuration config = new Configuration(e);
            // 자신의 매퍼를 여기에 추가하세요(cofig.addMapper(매퍼명.class)
            config.addMapper(EmployeeMapper.class);
            config.addMapper(ManagerMapper.class);
            sf = new SqlSessionFactoryBuilder().build(config);

        }
        return sf.openSession(false);
    }
}
