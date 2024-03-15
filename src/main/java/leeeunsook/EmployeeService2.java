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
}

