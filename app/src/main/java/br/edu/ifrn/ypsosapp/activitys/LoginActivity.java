package br.edu.ifrn.ypsosapp.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.ifrn.ypsosapp.R;


public class LoginActivity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etSenha;
    private Button btnLogar;
    private CheckBox tipoConta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etSenha = (EditText) findViewById(R.id.etSenha);
        tipoConta = (CheckBox) findViewById(R.id.cbTipoConta);

        btnLogar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                verificarLogin();
            }
        });

    }

    public void verificarLogin(){
        String email = etEmail.getText().toString();
        String senha = etSenha.getText().toString();

        if(!email.isEmpty() && !senha.isEmpty()) {

            if (tipoConta.isChecked()) {
                //chamar método para logar professor
            } else {
                //chamar método para logar aluno
            }
        }else{
            Toast.makeText(LoginActivity.this, "Oops, preencha os campos.", Toast.LENGTH_LONG).show();
        }
    }
}
