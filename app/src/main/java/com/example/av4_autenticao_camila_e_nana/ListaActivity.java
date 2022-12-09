package com.example.av4_autenticao_camila_e_nana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ListaActivity extends AppCompatActivity {

    // Atributos dos objetos da GUI:
    private TextView lblUsuario;
    private EditText txtNome;
    private EditText txtNota1;
    private EditText txtNota2;
    private Button btnInserir;
    private Button btnSair;
    private ListView lista;
    // Atributo que é a referência para o nó raiz do BD no Firebase:
    private DatabaseReference BD = FirebaseDatabase.getInstance().getReference();
    // Atributo que é referência para o gerenciador de usuários:
    private FirebaseAuth usuarios = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }

    @Override
    public void onBackPressed() {
// Vazio pra desabilitar o back
    }
    /*private class EscutadorSair implements View.OnClickListener {

    }
    private class EscutadorInserir implements View.OnClickListener {

    }
    private class AlunosAdapter extends FirebaseListAdapter<Aluno> {

    }*/

}