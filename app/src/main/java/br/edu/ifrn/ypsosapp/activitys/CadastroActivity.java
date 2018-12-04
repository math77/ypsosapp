package br.edu.ifrn.ypsosapp.activitys;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.edu.ifrn.ypsosapp.R;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    private void cadastrar(){
        Dialog dialog = new Dialog(CadastroActivity.this);
        dialog.setTitle("Cadastrando...");
        dialog.setCancelable(false);
        dialog.show();

        //criar código para cadastrar
    }
}
