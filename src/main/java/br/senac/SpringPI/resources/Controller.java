package br.senac.SpringPI.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/") //a fim de mapear a raiz do servidor
    @ResponseBody //a fim de imprimir no corpo da página
    public String Ola() {
        return "Aplicação Funcionando";

    }
}
