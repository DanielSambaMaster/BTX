package Betrix.demo.identity.repository;

import Betrix.demo.identity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<User, String> {
}
