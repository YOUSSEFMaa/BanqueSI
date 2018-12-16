package org.devup.Dao;

import org.devup.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group , Long> {
}
