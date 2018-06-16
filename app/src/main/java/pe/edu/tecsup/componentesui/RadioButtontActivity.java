package pe.edu.tecsup.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class RadioButtontActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttont);

        radioGroup = findViewById(R.id.radio_group);
    }

    public void radioButotnClicked(View view){
        RadioButton radioButton = (RadioButton)view;

        switch (radioButton.getId()){
            case R.id.radio_button1:
                Toasty.info(this, "Radio Button 1 clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_button2:
                Toasty.info(this, "Radio Button 2 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_button3:
                Toasty.info(this, "Radio Button 3 clicked", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void actionExecute(View view){

        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if(radioButtonId == -1){
            Toasty.error(this, "Seleccione una opción", Toast.LENGTH_LONG).show();
            return;
        }

        switch (radioButtonId){
            case R.id.radio_button1:
                Toasty.info(this, "Radio Button 1 seleccionado!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_button2:
                Toasty.info(this, "Radio Button 2 seleccionado!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_button3:
                Toasty.info(this, "Radio Button 3 seleccionado!", Toast.LENGTH_SHORT).show();
                break;
        }


    }

}
