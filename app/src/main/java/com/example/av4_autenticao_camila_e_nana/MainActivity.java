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

        // O usuário logado "fica" entre execuções do app no celular.
        // Então, logo de cara vamos ver se tem alguém logado.
        // Se tiver, indicamos isso em lblEstado:
        /*if ( usuarios.getCurrentUser() != null ) {
            lblEstado.setText( "Tem usuário logado no sistema: " + usuarios.getCurrentUser().getEmail() );
            //chamar a outra activity (ListaActivity)
        }*/

    }

    /*private class EscutadorLogin implements View.OnClickListener {
        @Override
        public void onClick(View view) {


            lblEstado.setText( "Tentando criar novo usuário..." );
            // Verifica se o usuário já está logado:
            if ( usuarios.getCurrentUser() != null ) {
                // Exibe mensagem de usuário já logado, em lblEstado:
                lblEstado.setText("Já tem um usuário logado!!" + usuarios.getCurrentUser().getEmail());
            }else {
                // Usuário não logado.
                // Pega email e senha na interface:
                String email = txtEmail.getText().toString();
                String senha = txtSenha.getText().toString();
                // Tenta criar o usuário:
                usuarios.createUserWithEmailAndPassword(email, senha)
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                @Override
                    public void onComplete(Task<AuthResult> task) {
                    // Testa se criou o usuário com sucesso:
                    if ( task.isSuccessful() ) {
                        // Criou e logou com sucesso.
                        // Exibe mensagem em lblEstado:
                        lblEstado.setText("Usuário criado e logado c/ sucesso" + usuarios.getCurrentUser().getEmail());
                    }else {
                        // Não conseguiu criar o usuário.
                        // Exibe mensagem em lblEstado:
                        lblEstado.setText("Criação do usuário falhou!");
                        // Exibe a mensagem de erro do Firebase num Toast:
                        FirebaseAuthException e = (FirebaseAuthException)task.getException();
                        Toast.makeText(MainActivity.this, "ERRO: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
             });
           }
            }
            @Override
            public void onClick(View view) {
            ...
            else {
            // Usuário não logado.
            // Pega email e senha na interface:
            String email = txtEmail.getText().toString();
            String senha = txtSenha.getText().toString();
            // Tenta criar o usuário:
            usuarios.createUserWithEmailAndPassword(email, senha)
            .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(Task<AuthResult> task) {
            // Testa se criou o usuário com sucesso:
            if ( task.isSuccessful() ) {
            // Criou e logou com sucesso.
            // Exibe mensagem em lblEstado:
            lblEstado.setText("Usuário criado e logado c/ sucesso" + usuarios.getCurrentUser().getEmail());
            }
            else {
            // Não conseguiu criar o usuário.
            // Exibe mensagem em lblEstado:
            lblEstado.setText("Criação do usuário falhou!");
            // Exibe a mensagem de erro do Firebase num Toast:
            FirebaseAuthException e = (FirebaseAuthException)task.getException();
            Toast.makeText(MainActivity.this, "ERRO: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
            }
            });
            }


        }
    }
    private class EscutadorCriar implements View.OnClickListener {
        @Override
        public void onClick(View view) {

        }
    }*/

}