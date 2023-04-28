package com.adilbou.securityjwt.Repositories;


import com.adilbou.securityjwt.Entities.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourceRepository extends JpaRepository<Ressource, Long> {



}
