package iuh.se.vn.repositorires;

import iuh.se.vn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
