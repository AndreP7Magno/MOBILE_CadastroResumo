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

        txtNome.setText(cadastroCurso.getStringExtra("txtNome"));
        txtLogradouroNumero.setText(cadastroCurso.getStringExtra("txtLogradouro") + " - " + cadastroCurso.getStringExtra("txtNumero"));
        txtBairroCidade.setText(cadastroCurso.getStringExtra("txtBairro") + " - " + cadastroCurso.getStringExtra("txtCidade"));
        txtTelefone.setText(cadastroCurso.getStringExtra("txtTelefone"));
        txtFaculdade.setText(cadastroCurso.getStringExtra("txtFaculdade"));
        txtCursoTurno.setText(cadastroCurso.getStringExtra("txtCurso") + " - " + cadastroCurso.getStringExtra("txtTurno"));

    }
}
