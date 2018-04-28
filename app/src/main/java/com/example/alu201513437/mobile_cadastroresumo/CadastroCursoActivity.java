package com.example.alu201513437.mobile_cadastroresumo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class CadastroCursoActivity extends AppCompatActivity {

    private String txtNome;
    private String txtLogradouro;
    private String txtNumero;
    private String txtBairro;
    private String txtCidade;
    private String txtTelefone;

    @InjectView(R.id.txtCurso) EditText txtCurso;
    @InjectView(R.id.txtTurno) EditText txtTurno;
    @InjectView(R.id.txtFaculdade) EditText txtFaculdade;
    @InjectView(R.id.btnSubmit) Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_curso);
        ButterKnife.inject(this);

        Intent cadastroCurso = getIntent();

        txtNome = cadastroCurso.getStringExtra("nome");
        txtLogradouro = cadastroCurso.getStringExtra("logradouro");
        txtNumero = cadastroCurso.getStringExtra("numero");
        txtBairro = cadastroCurso.getStringExtra("bairro");
        txtCidade = cadastroCurso.getStringExtra("cidade");
        txtTelefone = cadastroCurso.getStringExtra("telefone");

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMostrarClick(view);
            }
        });
    }

    private void btnMostrarClick(View view) {
        if(Valida())
        {
            Intent resumo = new Intent( this, ResumoActivity.class);

        resumo.putExtra("txtNome", txtNome);
        resumo.putExtra("txtLogradouro",txtLogradouro);
        resumo.putExtra("txtNumero",txtNumero);
        resumo.putExtra("txtBairro",txtBairro);
        resumo.putExtra("txtCidade",txtCidade);
        resumo.putExtra("txtTelefone",txtTelefone);
        resumo.putExtra("txtCurso",txtCurso.getText().toString());
        resumo.putExtra("txtTurno",txtTurno.getText().toString());
        resumo.putExtra("txtFaculdade",txtFaculdade.getText().toString());

        startActivity(resumo);
    }
        else{

            onLoginFailed();
        }
    }

    private boolean Valida() {
        boolean valid = true;

        String curso = txtCurso.getText().toString();
        String turno = txtTurno.getText().toString();
        String faculdade = txtFaculdade.getText().toString();

        if (curso.isEmpty()) {
            txtCurso.setError("Digite seu nome!");
            valid = false;
        } else if (turno.isEmpty()){
            txtTurno.setError("Digite o logradouro!");
            valid = false;
        } else if (faculdade.isEmpty()){
            txtFaculdade.setError("Digite o número!");
            valid = false;
        }

        return valid;
    }

    private void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Preencha todos os campos!", Toast.LENGTH_LONG).show();
    }

}
