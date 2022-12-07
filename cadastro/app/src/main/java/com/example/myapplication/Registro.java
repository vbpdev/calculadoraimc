package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela_Registro extends AppCompatActivity {
    Button btnvoltar2, btncadastro;
    EditText edtnome, edtemail, edttelefone;
    String nome, email, telefone, cadResultado;
    TextView txtresultado2;
    Intent i;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnvoltar2 = findViewById(R.id.btnTela3);
        btnvoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(Tela_Registro.this, MainActivity.class);
                startActivity(i);

            }
        });

        btncadastro = findViewById(R.id.btnCadastro);

        btncadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnome = findViewById(R.id.edtNome);
                nome = edtnome.getText().toString().trim();
                edtemail = findViewById(R.id.edtEmail);
                email = edtemail.getText().toString().trim();
                edttelefone = findViewById(R.id.edtTelefone);
                telefone = edttelefone.getText().toString().trim();
                cadResultado = nome + email + telefone;
                txtresultado2 = findViewById(R.id.txtResultado2);
                txtresultado2.setText(cadResultado);
            }
        });
    }
}