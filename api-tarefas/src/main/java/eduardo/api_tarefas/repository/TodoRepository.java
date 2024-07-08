package eduardo.api_tarefas.repository;

import eduardo.api_tarefas.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.stereotype.Repository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
