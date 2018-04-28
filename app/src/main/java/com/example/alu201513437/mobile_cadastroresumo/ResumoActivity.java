package com.example.alu201513437.mobile_cadastroresumo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ResumoActivity extends AppCompatActivity {

    @InjectView(R.id.txtNome)
    TextView txtNome;
    @InjectView(R.id.txtLogradouroNumero)
    TextView txtLogradouroNumero;
    @InjectView(R.id.txtBairroCidade)
    TextView txtBairroCidade;
    @InjectView(R.id.txtTelefone)
    TextView txtTelefone;
    @InjectView(R.id.txtFaculdade)
    TextView txtFaculdade;
    @InjectView(R.id.txtCursoTurno)
    TextView txtCursoTurno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);
        ButterKnife.inject(this);

        Intent resumo = getIntent();

        txtNome.setText("Nome: " + resumo.getStringExtra("txtNome"));
        txtLogradouroNumero.setText(resumo.getStringExtra("txtLogradouro") + " - " + resumo.getStringExtra("txtNumero"));
        txtBairroCidade.setText(resumo.getStringExtra("txtBairro") + " - " + resumo.getStringExtra("txtCidade"));
        txtTelefone.setText("Telefone: " + resumo.getStringExtra("txtTelefone"));
        txtFaculdade.setText("Faculdade: " + resumo.getStringExtra("txtFaculdade"));
        txtCursoTurno.setText("Curso/Turno: " + resumo.getStringExtra("txtCurso") + " - " + resumo.getStringExtra("txtTurno"));

    }
}
