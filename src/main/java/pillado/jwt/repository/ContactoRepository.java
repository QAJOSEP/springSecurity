package pillado.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pillado.jwt.model.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
