package com.example.alu201513437.mobile_cadastroresumo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class CadastroCursoActivity extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtLogradouro;
    private EditText txtNumero;
    private EditText txtBairro;
    private EditText txtCidade;
    private EditText txtTelefone;

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

        txtNome.setText(cadastroCurso.getStringExtra("input_nome"));
        txtLogradouro.setText(cadastroCurso.getStringExtra("input_logradouro"));
        txtNumero.setText(cadastroCurso.getStringExtra("input_numero"));
        txtBairro.setText(cadastroCurso.getStringExtra("input_bairro"));
        txtCidade.setText(cadastroCurso.getStringExtra("input_cidade"));
        txtTelefone.setText(cadastroCurso.getStringExtra("input_telefone"));

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMostrarClick(view);
            }
        });
    }

    private void btnMostrarClick(View view) {
        Intent resumo = new Intent( this, ResumoActivity.class);


        resumo.putExtra("txtNome",txtNome.getText().toString());
        resumo.putExtra("txtLogradouro",txtLogradouro.getText().toString());
        resumo.putExtra("txtNome",txtNumero.getText().toString());
        resumo.putExtra("txtBairro",txtBairro.getText().toString());
        resumo.putExtra("txtCidade",txtCidade.getText().toString());
        resumo.putExtra("txtTelefone",txtTelefone.getText().toString());
        resumo.putExtra("txtCurso",txtCurso.getText().toString());
        resumo.putExtra("txtTurno",txtTurno.getText().toString());
        resumo.putExtra("txtFaculdade",txtFaculdade.getText().toString());

        startActivity(resumo);
    }
}
