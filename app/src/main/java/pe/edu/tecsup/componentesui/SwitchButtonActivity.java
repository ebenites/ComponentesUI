package pe.edu.tecsup.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class SwitchButtonActivity extends AppCompatActivity {

    private static final String TAG = SwitchButtonActivity.class.getSimpleName();

    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_button);

        switch1 = findViewById(R.id.switch1);

        // cambiar estado programaticamente
        switch1.setChecked(true);

        if(switch1.isChecked()){
            Toasty.info(SwitchButtonActivity.this, "Opción precargada", Toast.LENGTH_LONG, true).show();
        }

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d(TAG, "onCheckedChanged: " + isChecked);
                if(isChecked){
                    Toasty.success(SwitchButtonActivity.this, "Opción activada!", Toast.LENGTH_LONG, true).show();
                }else{
                    Toasty.error(SwitchButtonActivity.this, "Opción desactivada!", Toast.LENGTH_LONG, true).show();
                }
            }
        });


    }
}
