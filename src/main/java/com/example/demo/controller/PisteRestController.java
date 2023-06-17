package com.example.demo.controller;

import com.example.demo.service.IPisteService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/piste")
public class PisteRestController {
    IPisteService iPisteService ;
}
