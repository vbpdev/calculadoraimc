package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnsoma, btnsubtracao, btnmultiplicar, btndividir, btnTela2;
    Integer soma, subtracao, multiplicar, dividir;
    EditText edtvalor1, edtvalor2;
    TextView txtResultado;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsoma = findViewById(R.id.btnSoma);
        btnsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtvalor1 = findViewById(R.id.edtValor1);
                edtvalor2 = findViewById(R.id.edtValor2);
                soma = 1 + 1;
                txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(soma);
            }
        });

        btnsubtracao = findViewById(R.id.btnSubtracao);
        btnsubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtvalor1 = findViewById(R.id.edtValor1);
                edtvalor2 = findViewById(R.id.edtValor2);
                subtracao = 1 - 1;
                txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(subtracao);
            }
        });

        btnmultiplicar = findViewById(R.id.btnSubtracao);
        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtvalor1 = findViewById(R.id.edtValor1);
                edtvalor2 = findViewById(R.id.edtValor2);
                multiplicar = 1 * 1;
                txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(multiplicar);
            }
        });

        btndividir = findViewById(R.id.btnSubtracao);
        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtvalor1 = findViewById(R.id.edtValor1);
                edtvalor2 = findViewById(R.id.edtValor2);
                dividir = 1 * 1;
                txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(dividir);
            }
        });

        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, Calculadora.class);
                startActivity(i);
            }
        });
    }
}