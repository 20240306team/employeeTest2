package leeeunsook;

import common.EmployeeDTO;
import leeeunsook.EmployeeInformation;
import leeeunsook.UpdateBonus;

import java.util.Map;

public interface ManagerMapper {

    EmployeeInformation employeeInformation(Map<String,String> parameter);

    UpdateBonus updateBonus(Map<String, String> parameter);

    EmployeeDTO isEmployeeDTO(Map<String, String> parameter);

    int salLevel(Map<String, String> parameter);
}


