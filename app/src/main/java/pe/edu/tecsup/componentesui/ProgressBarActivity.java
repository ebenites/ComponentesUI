package pe.edu.tecsup.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class ProgressBarActivity extends AppCompatActivity {

    private EditText valueEditText;
    private Button actionButton;
    private ProgressBar progressBar;

    private ProgressBar indeterminateProgressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        valueEditText = findViewById(R.id.value_edittext);
        actionButton = findViewById(R.id.action_button);
        progressBar = findViewById(R.id.progressbar);

        indeterminateProgressbar = findViewById(R.id.indeterminate_progressbar);

        // Onlclick al boton
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarValor();
            }
        });

    }

    private void mostrarValor(){
        String valor = valueEditText.getText().toString();

        if(valor.isEmpty()){
            Toasty.error(this, "Indique un valor", Toast.LENGTH_LONG).show();
            return;
        }

        progressBar.setProgress(Integer.parseInt(valor));

    }

    public void cargarAction(View view){
        indeterminateProgressbar.setVisibility(View.VISIBLE);
    }

    public void detenerAction(View view){
        indeterminateProgressbar.setVisibility(View.GONE);
    }

}
