package shop.mtcoding.rodongin.model.employee;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeCareerRepository {
    public int insert(@Param("employeeCareer") EmployeeCareer employeeCareer,
            @Param("employeeId") int employeeId);
}
