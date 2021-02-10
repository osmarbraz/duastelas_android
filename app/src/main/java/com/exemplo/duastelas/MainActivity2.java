package com.exemplo.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Associa os componentes da interface aos componentes da classe
        buttonVoltar = findViewById(R.id.buttonVoltar);
    }

    public void onClickBotaoVoltar(View v) {

        //Fecha a activity e volta a anterior
        finish();
    }
}