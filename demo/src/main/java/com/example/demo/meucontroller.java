package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class meucontroller {
    @RestController
public class MeuController {
@GetMapping(value = "/")
public String getMethodName() {
return "Olá Mundo";
}
}
}
