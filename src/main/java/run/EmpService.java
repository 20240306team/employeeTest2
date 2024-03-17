package run;

import common.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import static common.Template.getSqlSession;

public class EmpService {

private static EmpMapper mapper;
    public static boolean loginsuccess(EmployeeDTO ok) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmpMapper.class);

        boolean result = mapper.login(ok);
        if (result){
            System.out.println("로그인 완료 ");
        } else {
            System.out.println("로그인 실패");

        }


        sqlSession.close();

        return result;
    }
}
