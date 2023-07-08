package med.voll.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
