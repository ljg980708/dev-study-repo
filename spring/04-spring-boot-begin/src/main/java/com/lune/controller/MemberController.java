package com.lune.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class MemberController {

    @GetMapping("member")
    public ResponseEntity getMember(){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
