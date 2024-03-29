package leeeunsook;

import common.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

import static common.Template.getSqlSession;

public class EmployeeService2 {
     ManagerMapper mapper;


    public EmployeeDTO isEmployee(Map<String, String> parameter) {

        SqlSession session =getSqlSession();
        mapper = session.getMapper(ManagerMapper.class);

        return mapper.isEmployeeDTO(parameter);


    }

    public boolean salLevel(Map<String,String> parameter){
        SqlSession session = getSqlSession();
        mapper =session.getMapper(ManagerMapper.class);
        int result = mapper.salLevel(parameter);
        if (result>0){
            session.commit();
        }else{session.rollback();}


        return result >0 ? true : false ;
    }
}

