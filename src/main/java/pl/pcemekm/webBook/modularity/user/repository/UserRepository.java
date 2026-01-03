package pl.pcemekm.webBook.modularity.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pcemekm.webBook.modularity.user.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
