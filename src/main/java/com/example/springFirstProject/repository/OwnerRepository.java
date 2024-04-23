package com.example.springFirstProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springFirstProject.entity.Owner;



@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
	
	//public Owner findByOwnerId(Long ownerId);
    public Owner findByOwnerName(String ownrName);
   // public Owner savOwner(Owner owner);
   // public List<Owner> findOwners();

}
