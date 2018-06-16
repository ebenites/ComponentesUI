package pe.edu.tecsup.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class RatingBarActivity extends AppCompatActivity {

    private static final String TAG = RatingBarActivity.class.getSimpleName();

    private RatingBar ratingBar;
    private Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        ratingBar = findViewById(R.id.valoracion_ratingbar);

        actionButton = findViewById(R.id.action_button);
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numStars = ratingBar.getNumStars();
                Log.d(TAG, "numStars: " + numStars);
                float rating = ratingBar.getRating();
                Log.d(TAG, "rating: " + rating);

                Toasty.success(getApplicationContext(),"Valor seleccionado: " + rating, Toast.LENGTH_LONG).show();

            }
        });

        // Crear Layouts programaticamente
        // https://stackoverflow.com/a/4979362

    }
}
