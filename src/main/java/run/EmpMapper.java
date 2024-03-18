package run;

import common.EmployeeDTO;

public interface EmpMapper {
    boolean login(EmployeeDTO ok);

    void serch(EmployeeDTO employeeDTO);
}
