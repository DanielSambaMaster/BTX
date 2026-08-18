package Betrix.demo.identity.controller;


import Betrix.demo.identity.service.Service;
import Betrix.demo.identity.user.userValidationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class Controller {




    private Service serviceUser;

    @Autowired
    public Controller(Service serviceUser){
        this.serviceUser=serviceUser;
    }


    @PostMapping("/authentication")
    public ResponseEntity  postAuthentication(@RequestBody @Validated userValidationDTO data ){
        return ResponseEntity.ok(serviceUser.Authetication());
    }





}
