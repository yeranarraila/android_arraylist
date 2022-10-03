package com.example.testearraycerto;

import java.util.ArrayList;

public class ControllerLogin {

    private ArrayList<Pessoa> lista_de_pessoas = new ArrayList<Pessoa>();

    public int inserePessoa(String nome, String login, String senha){
        Pessoa p = new Pessoa();

        p.setNome(nome);
        p.setLogin(login);
        p.setSenha(senha);

        lista_de_pessoas.add(p);

        return 1;
    }

}

