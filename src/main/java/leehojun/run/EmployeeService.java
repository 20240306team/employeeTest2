package leehojun.run;

import common.EmployeeDTO;
import leehojun.common.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

import static common.Template.getSqlSession;

public class EmployeeService {
    EmployeeMapper mapper;
    public boolean isEmployee(MemberDTO memberDTO) {

        SqlSession session = getSqlSession();
        mapper = session.getMapper(EmployeeMapper.class);

        EmployeeDTO employee =mapper.isEmployee(memberDTO);
        if(employee!=null){
            return true;
        }
        else{
            return false;
        }

    }

    public GetPhoneNumber getPhoneNumber(Map<String, String> parameter) {
        SqlSession session = getSqlSession();
        mapper = session.getMapper(EmployeeMapper.class);

        return mapper.getPhoneNumber(parameter);
    }

    public boolean updateEmpInfo(Map<String, String> parameter) {
        SqlSession session =getSqlSession();
        mapper = session.getMapper(EmployeeMapper.class);

        int result = mapper.updateEmpInfo(parameter);
        if(result>0){
            session.commit();
        }else{
            session.rollback();
        }

        return result>0? true:false;

    }
}
