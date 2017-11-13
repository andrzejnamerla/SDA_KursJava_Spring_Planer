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

/*Employee:
* id, firstName, lastName, phoneNumber, email, DepartmentEnum(enum - BACKED, FRONTEND, HR)
*
* EmployeeController (htmle):
* allEmployees(lista pracownikow oraz formularz), employee
*
* EmployeeService:
* getAll, get(id), add(Employee)
*
* Employee Repository
*
* */
