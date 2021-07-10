package com.baeldung.repo;


import java.util.Optional;
import com.baeldung.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserJpaRepository extends JpaRepository<User, String> {

	Optional<User> findByUsername(String username);

}
