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

public class CadastroPessoalActivity extends AppCompatActivity {

    @InjectView(R.id.input_nome)
    EditText _nomeText;
    @InjectView(R.id.input_logradouro)
    EditText _logradouroText;
    @InjectView(R.id.input_numero)
    EditText _NumeroText;
    @InjectView(R.id.input_Bairro)
    EditText _BairroText;
    @InjectView(R.id.input_Cidade)
    EditText _CidadeText;
    @InjectView(R.id.input_telefone)
    EditText _TelefoneText;
    @InjectView(R.id.btn_continuar)
    Button _ProsseguirButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoal);
        ButterKnife.inject(this);

        _ProsseguirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Prosseguir();
            }
        });
    }

    private void Prosseguir() {
        if (!Valido()) {
            onProsseguirFailed();
            return;
        }

        _ProsseguirButton.setEnabled(false);

        onProsseguirSuccess();
    }

    private boolean Valido() {
        boolean valid = true;

        String nome = _nomeText.getText().toString();
        String logradouro = _logradouroText.getText().toString();
        String numero = _NumeroText.getText().toString();
        String bairro = _BairroText.getText().toString();
        String cidade = _CidadeText.getText().toString();
        String telefone = _TelefoneText.getText().toString();

        if (nome.isEmpty()) {
            _nomeText.setError("Digite seu nome!");
            valid = false;
        } else if (logradouro.isEmpty()) {
            _logradouroText.setError("Digite o logradouro!");
            valid = false;
        } else if (numero.isEmpty()) {
            _NumeroText.setError("Digite o número!");
            valid = false;
        } else if (bairro.isEmpty()) {
            _BairroText.setError("Digite seu bairro!");
            valid = false;
        } else if (cidade.isEmpty()) {
            _CidadeText.setError("Digite sua cidade!");
            valid = false;
        } else if (telefone.isEmpty()) {
            _TelefoneText.setError("Digite seu telefone!");
            valid = false;
        } else {
            _nomeText.setError(null);
            _logradouroText.setError(null);
            _NumeroText.setError(null);
            _BairroText.setError(null);
            _CidadeText.setError(null);
            _TelefoneText.setError(null);
        }

        return valid;
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    public void onProsseguirFailed() {
        Toast.makeText(getBaseContext(), "Preencha todos os campos!", Toast.LENGTH_LONG).show();

        _ProsseguirButton.setEnabled(true);
    }

    public void onProsseguirSuccess() {
        Intent cadastroCurso = new Intent(this, CadastroCursoActivity.class);

        cadastroCurso.putExtra("nome", _nomeText.getText().toString());
        cadastroCurso.putExtra("logradouro", _logradouroText.getText().toString());
        cadastroCurso.putExtra("numero", _NumeroText.getText().toString());
        cadastroCurso.putExtra("bairro", _BairroText.getText().toString());
        cadastroCurso.putExtra("cidade", _CidadeText.getText().toString());
        cadastroCurso.putExtra("telefone", _TelefoneText.getText().toString());

        startActivity(cadastroCurso);

        _ProsseguirButton.setEnabled(true);
    }
}
