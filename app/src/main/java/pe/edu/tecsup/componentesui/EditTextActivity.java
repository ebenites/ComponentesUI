package pe.edu.tecsup.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class EditTextActivity extends AppCompatActivity {

    private static final String TAG = EditTextActivity.class.getSimpleName();

    private EditText nombresInput;
    private EditText apellidosInput;
    private Button generarButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        nombresInput = findViewById(R.id.nombres_text);
        apellidosInput = findViewById(R.id.apellidos_text);
        generarButton = findViewById(R.id.generar_button);
        resultText = findViewById(R.id.result_text);

        // Definir el evento onClick
        generarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generarUsuario();
            }
        });

    }

    public void generarUsuario(){
        Log.d(TAG, "calling generarUsuario()");
        try{

            String nombres = nombresInput.getText().toString();
            String apellidos = apellidosInput.getText().toString();

            // validacion
            if(nombres.isEmpty() || apellidos.isEmpty()){
                Toasty.error(this, "Complete todos los campos", Toast.LENGTH_LONG, true).show();
                return;
            }

            StringBuilder sb = new StringBuilder();
            String usuario = sb.append(nombres.substring(0, 1)).append(apellidos).toString();

            resultText.setText(usuario.toLowerCase());

        }catch (Throwable t){
            Log.e(TAG, t.getMessage(), t);
        }
    }

}
