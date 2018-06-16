package pe.edu.tecsup.componentesui;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class CustomAlertDialogActivity extends AppCompatActivity {

    private EditText valueInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_dialog);

        valueInput = findViewById(R.id.value_input);
    }

    private EditText nombresInput;
    private EditText apellidosInput;

    private Dialog dialog;

    public void showAlert(View view){

        // recuperar el valor del input
        String nombresIniciales = valueInput.getText().toString();

        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_custom);
        dialog.setTitle("Datos de usuario");

        // Configuramos los componentes del layout dentro del dialog
        nombresInput = dialog.findViewById(R.id.nombres_input);
        apellidosInput = dialog.findViewById(R.id.apellidos_input);

        nombresInput.setText(nombresIniciales);

        Button saveButton = dialog.findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });

        dialog.show();

    }

    private void save(){
        String nombres = nombresInput.getText().toString();
        String apellidos = apellidosInput.getText().toString();

        String message= "Usuario: " + nombres + " " + apellidos + " guardado!";
        Toasty.success(this, message, Toast.LENGTH_LONG).show();

        dialog.dismiss();
    }

}
