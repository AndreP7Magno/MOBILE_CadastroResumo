package com.example.alu201513437.mobile_cadastroresumo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ResumoActivity extends AppCompatActivity {

    @InjectView(R.id.txtNome) TextView txtNome;
    @InjectView(R.id.txtLogradouroNumero) TextView txtLogradouroNumero;
    @InjectView(R.id.txtBairroCidade) TextView txtBairroCidade;
    @InjectView(R.id.txtTelefone) TextView txtTelefone;
    @InjectView(R.id.txtFaculdade) TextView txtFaculdade;
    @InjectView(R.id.txtCursoTurno) TextView txtCursoTurno;

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
