package org.devup.Dao;

import org.devup.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe , Long> {
}
