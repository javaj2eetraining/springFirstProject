package com.example.springFirstProject.controller;

import com.example.springFirstProject.entity.Department;
import com.example.springFirstProject.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springFirstProject.entity.Owner;

import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    OwnerService ownerService;

    @PostMapping("/Owners")
    public Owner saveOwner(@RequestBody Owner owner){
        return ownerService.saveOwner(owner);


    }

    @GetMapping("/getOwners")
    public List<Owner> getAllOwners() {
        return ownerService.getOwners();

    }

    @GetMapping("/GetOwner/{id}")
    public Owner getOwner(@PathVariable("id") Long id){
        return ownerService.getOwner(id);
    }

    @GetMapping("/getOwnersName/{name}")
    public Owner getOwnerByName(@PathVariable("name")  String ownrName  )
    {
        return  ownerService.getOwnerByName(ownrName)  ;
    }


//    @PutMapping("/update/{id}")
//    public Owner updateOwner(@RequestBody Owner owner , @PathVariable("id") Long id){
//        return ownerService.updateOwner(owner,id);
//    }

    @DeleteMapping("/delete/{id}")
    public String deleteOwner(@PathVariable("id") Long id){
         ownerService.deleteOwner(id);
         return "Deleted Successfully";

    }

    }
