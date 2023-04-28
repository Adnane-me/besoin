package com.adilbou.securityjwt.Service;


import com.adilbou.securityjwt.Entities.Ressource;
import com.adilbou.securityjwt.Repositories.RessourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RessourceServiceImpl implements RessourceService {

    private final RessourceRepository ressourceRepository;
   // private  final ResourceFournisseurRepository resourceFournisseurRepository;

    public RessourceServiceImpl(RessourceRepository ressourceRepository) {
        this.ressourceRepository = ressourceRepository;
        //this.resourceFournisseurRepository = resourceFournisseurRepository;
    }

    @Override
    public List<Ressource> getAllRessources() {
        return ressourceRepository.findAll();
    }

    @Override
    public List<Ressource> getRessourcesByMembreDepartement(String id) {
        return null;
    }

    @Override
    public Ressource addRessource(Ressource ressource) {
        return ressourceRepository.save(ressource);
    }



    @Override
    public List<Ressource> addMultipleRessources(List<Ressource> ressources) {
        return ressourceRepository.saveAll(ressources);
    }

    @Override
    public Ressource updateRessource(Ressource ressource) {
        return ressourceRepository.save(ressource);
    }

    @Override
    public void deleteRessource(Long id) {
        Ressource ressource = ressourceRepository.findById(id).orElseThrow();
        ressource.setIsDeleted(true);
        ressourceRepository.save(ressource);
    }

    @Override
    public List<Ressource> getRessourcesByDepartement(Long id) {
        return null;
    }
}
