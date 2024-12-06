package ma.projet.grpc.repositories;

import ma.projet.grpc.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {
    List<Compte> findByType(String type);
}
