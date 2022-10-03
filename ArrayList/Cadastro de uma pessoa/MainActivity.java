package com.example.testearraycerto;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void enviarDados(View v){
        ControllerLogin c = new ControllerLogin();

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

}

