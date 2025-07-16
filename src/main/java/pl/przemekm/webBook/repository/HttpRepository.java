package pl.przemekm.webBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.przemekm.webBook.entity.Http;

public interface HttpRepository extends JpaRepository<Http,Long> {
}
