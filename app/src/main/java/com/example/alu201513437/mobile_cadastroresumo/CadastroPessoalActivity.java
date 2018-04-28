package com.example.alu201513437.mobile_cadastroresumo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class CadastroPessoalActivity extends AppCompatActivity {

    @InjectView(R.id.input_nome) EditText _nomeText;
    @InjectView(R.id.input_logradouro) EditText _logradouroText;
    @InjectView(R.id.input_numero) EditText _NumeroText;
    @InjectView(R.id.input_Bairro) EditText _BairroText;
    @InjectView(R.id.input_Cidade) EditText _CidadeText;
    @InjectView(R.id.input_telefone) EditText _TelefoneText;
    @InjectView(R.id.btn_continuar) Button _ProsseguirButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoal);
        ButterKnife.inject(this);

        _ProsseguirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //verificarCampos();
            }
        });
    }

    /*private void verificarCampos()
    {

        if (!Valido()) {
            onLoginFailed();
            return;
        }
    }

    private boolean Valido()
    {
        boolean valid = true;

        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _emailText.setError("Digite um email válido!");
            valid = false;
        } else {
            _emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            _passwordText.setError("Digite entre 4 e 10 caracteres!");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        return valid;
    }*/
}
