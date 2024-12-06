package ma.projet.grpc.services;

import lombok.RequiredArgsConstructor;
import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.repositories.CompteRepository;
import ma.projet.grpc.stubs.TypeCompte;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompteService {
    private final CompteRepository compteRepository;

    public List<Compte> findAllComptes(){
        return compteRepository.findAll();
    }

    public Compte findCompteById(String id){
        return compteRepository.findById(id).orElse(null);
    }
    public Compte saveCompte(Compte compte){
        return compteRepository.save(compte);
    }
    public List<Compte> findByType(TypeCompte typeCompte){
        return compteRepository.findByType(typeCompte.name());
    }
    public Boolean deleteCompteById(String id){
        if (compteRepository.findById(id).isPresent()){
            compteRepository.deleteById(id);
            return true;
        }else{
            return false;
        }

    }
}
