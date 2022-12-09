package com.example.av4_autenticao_camila_e_nana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    //Camila Devita Basaglia - SC3010058
    //Nana de Souza Ekman Simões - SC3010414

    // Atributos dos objetos da GUI:
    private EditText txtEmail;
    private EditText txtSenha;
    private Button btnLogin;
    private Button btnCriar;

    // Atributo que é referência para o gerenciador de usuários:
    private FirebaseAuth usuarios = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);
        btnLogin = findViewById(R.id.btnLogin);
        btnCriar = findViewById(R.id.btnCriar);

    }

    /*private class EscutadorLogin implements View.OnClickListener {
        @Override
        public void onClick(View view) {

        }
    }
    private class EscutadorCriar implements View.OnClickListener {
        @Override
        public void onClick(View view) {

        }
    }*/

}