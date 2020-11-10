package ru.specialist.getJson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.specialist.getJson.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
