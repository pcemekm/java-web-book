package pl.przemekm.webBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.przemekm.webBook.entity.Task;

public interface TaskReposiory extends JpaRepository<Task, Long> {
}
