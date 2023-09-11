package org.ada.postgres.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ada.postgres.data.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

