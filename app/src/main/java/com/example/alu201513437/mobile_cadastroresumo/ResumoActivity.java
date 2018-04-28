package com.example.alu201513437.mobile_cadastroresumo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ResumoActivity extends AppCompatActivity {

    @InjectView(R.id.txtNome)
    EditText txtNome;
    @InjectView(R.id.txtLogradouroNumero)
    EditText txtLogradouroNumero;
    @InjectView(R.id.txtBairroCidade)
    EditText txtBairroCidade;
    @InjectView(R.id.txtTelefone)
    EditText txtTelefone;
    @InjectView(R.id.txtFaculdade)
    EditText txtFaculdade;
    @InjectView(R.id.txtCursoTurno)
    EditText txtCursoTurno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);
        ButterKnife.inject(this);

        Intent cadastroCurso = getIntent();

        txtNome.setText("Nome: " + cadastroCurso.getStringExtra("txtNome"));
        txtLogradouroNumero.setText("Logradouro/Número:" + cadastroCurso.getStringExtra("txtLogradouro") + " - " + cadastroCurso.getStringExtra("txtNumero"));
        txtBairroCidade.setText("Bairro/Cidade" + cadastroCurso.getStringExtra("txtBairro") + " - " + cadastroCurso.getStringExtra("txtCidade"));
        txtTelefone.setText("Telefone:" + cadastroCurso.getStringExtra("txtTelefone"));
        txtFaculdade.setText("Faculdade:" + cadastroCurso.getStringExtra("txtFaculdade"));
        txtCursoTurno.setText("Curso/Turno:" + cadastroCurso.getStringExtra("txtCurso") + " - " + cadastroCurso.getStringExtra("txtTurno"));

    }
}
