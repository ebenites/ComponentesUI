package pe.edu.tecsup.componentesui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class SimpleDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_dialog);
    }

    public void showAlert(View view){

        String tipoPizza = "Meat Lover";
        String tipoMaza = "Masa Gruesa";
        double montoTotal = 450.0;

        String message = "Su pedido  de " + tipoPizza + " con " + tipoMaza + " da un total de S/."
                + montoTotal;

        showMessage(message);

    }

    private void showMessage(String message){
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Confirmación de pedido");
        alertDialog.setMessage(message);
        alertDialog.setCancelable(false);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Toasty.info(getApplicationContext(), "Seleccionó OK", Toast.LENGTH_LONG).show();
            }
        });
//        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancelar", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toasty.info(getApplicationContext(), "Seleccionó Cancelar", Toast.LENGTH_LONG).show();
//            }
//        });
        alertDialog.show();
    }

}
