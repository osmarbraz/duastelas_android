package com.exemplo.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Componentes a serem manipulados
    private Button buttonTela2;
    private Button buttonFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associa os componentes da interface aos componentes da classe
        buttonTela2 = findViewById(R.id.buttonTela2);
        buttonFechar = findViewById(R.id.buttonFechar);
    }

    public void onClickBotaoTela2(View v) {
        //Recupera o intennt para a tela2
        Intent intent = new Intent(this, MainActivity2.class);
        //Abre a segunda tela
        startActivity(intent);
    }

    public void onClickBotaoFechar(View v) {
        System.exit(0);
    }
}