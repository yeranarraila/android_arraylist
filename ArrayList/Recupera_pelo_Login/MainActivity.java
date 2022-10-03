package com.example.testearraycerto;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ControllerLogin c = new ControllerLogin();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void enviarDados(View v){

        TextView txNome = (TextView) findViewById(R.id.entradaNome);
        String nome = txNome.getText().toString();

        TextView txLogin = (TextView) findViewById(R.id.entradaLogin);
        String login = txLogin.getText().toString();

        TextView txSenha = (TextView) findViewById(R.id.entradaSenha);
        String senha = txSenha.getText().toString();


        if( c.inserePessoa(nome,login,senha) == 1 ){
            System.out.println("Pessoa inserida com sucesso!");
            Toast.makeText(MainActivity.this, "Pessoa inserida com sucesso!!!!!", Toast.LENGTH_SHORT).show();
        }

    }

    public void recuperaNomePeloLogin(View v){
        ArrayList<Pessoa> p = new ArrayList<Pessoa>();
        String nome="NULL";

        p=c.getLista_de_pessoas();//recupera lista de pessoas

        TextView txLogin = (TextView) findViewById(R.id.entradaLogin); //recupera caixa de entrada do login
        String login = txLogin.getText().toString(); //recupera login digitado pelo user

        for(int i=0;i<p.size();i++) { //percorre a lista
            if(p.get(i).getLogin().equals(login)) { //se o login estiver na lista
                nome = p.get(i).getNome();//guarda o nome
            }
        }

        if(nome.equals("NULL")){
            Toast.makeText(MainActivity.this, "DADO NAO ENCONTRADO!", Toast.LENGTH_SHORT).show();//nao ha dado
        }else{
            Toast.makeText(MainActivity.this, nome, Toast.LENGTH_SHORT).show(); //ok!
        }

    }

}
