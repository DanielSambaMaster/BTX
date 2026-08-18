package Betrix.demo.identity.service;


import Betrix.demo.identity.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
public class Service {


    private RepositoryUser repository;

    @Autowired
    public Service(RepositoryUser repositoryUser){
        this.repository = repositoryUser;

    }


    public ResponseEntity<String> Authetication(){
        return ResponseEntity.ok("Authenticate");
    }

}
