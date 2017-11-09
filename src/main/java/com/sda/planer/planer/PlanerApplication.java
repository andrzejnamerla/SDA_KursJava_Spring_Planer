package com.sda.planer.planer;

import com.sda.planer.planer.model.DepartmentEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlanerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanerApplication.class, args);
	}
}

/*TODO Employee:
* id, firstName, lastName, phoneNumber, email, DepartmentEnum(enum - BACKED, FRONTEND, HR)
*
* TODO EmployeeController (htmle):
* allEmployees(lista pracownikow oraz formularz), employee
*
* TODO EmployeeService:
* getAll, get(id), add(Employee)
*
* TODO Employee Repository
*
* */
