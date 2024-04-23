package com.example.springFirstProject.service;


import com.example.springFirstProject.entity.Owner;
import com.example.springFirstProject.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {
    @Autowired
    OwnerRepository ownerRepository;

    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);


    }

    public List<Owner> getOwners() {
        return ownerRepository.findAll();
    }

    public Owner getOwner(Long ownerID) {
        Optional<Owner> owner= ownerRepository.findById(ownerID);
        if(!owner.isPresent()){
            throw new RuntimeException("Owner not found");
        }
        return owner.get();
    }
   public Owner getOwnerByName(String ownrName) {
        return  ownerRepository.findByOwnerName(ownrName);
    }


    public Owner updateOwner(Owner ownr, Long id) {
        Optional<Owner> owner =  ownerRepository.findById(id);

        if(!owner.isPresent())
        {
            throw new RuntimeException("Owner not found");
        }
        Owner existingDBowner = owner.get();

        if(!existingDBowner.getOwnerName().equals(ownr.getOwnerName()))
        {
            existingDBowner.setOwnerName(ownr.getOwnerName());
        }

        return ownerRepository.save(existingDBowner);
    }

    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }

}
