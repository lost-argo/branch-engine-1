package com.tuckersoft.branchengine.user.infrastructure;

import com.tuckersoft.branchengine.user.application.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}

