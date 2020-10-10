package com.anuradha.demonorepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - Anuradha Ranasinghe on 2020-10-10
 * @project - demo-no-repo
 **/
@RestController
@RequestMapping("/user")
@CrossOrigin
public class Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    @GetMapping("name")
    public ResponseEntity<?> getName() {
        LOGGER.info("request - user/name | getName");
        return new ResponseEntity<>("Anuradha", HttpStatus.OK);
    }


}
