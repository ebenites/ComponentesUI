package pe.edu.tecsup.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class AndroidButtonActivity extends AppCompatActivity {

    private static final String TAG = AndroidButtonActivity.class.getSimpleName();

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_button);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(AndroidButtonActivity.this, "Boton 2 ejecutado!", Toast.LENGTH_SHORT, true).show();
            }
        });
    }

    public void callActionOne(View view){
        Log.d(TAG, "calling callActionOne method...");
//        Toast.makeText(this, "Boton 1 ejecutado!", Toast.LENGTH_LONG).show();
        Toasty.success(this, "Boton 1 ejecutado!", Toast.LENGTH_SHORT, true).show();
    }

}
