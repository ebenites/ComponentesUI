package pe.edu.tecsup.componentesui;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
    }

    public void showNotification(View view){

        Notification notification = new NotificationCompat.Builder(this, "default")
                .setContentTitle("Pedido en camino")
                .setContentText("Su pedido llegará en 30 minutos...")
                .setSmallIcon(R.mipmap.ic_launcher)
                .build();


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationManager notificationManager = getSystemService(NotificationManager.class);

            // Se define un objecto NotificationChannel en Android 8
            NotificationChannel channel = new NotificationChannel("default",
                    "Channel name", NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription("Channel description");
            notificationManager.createNotificationChannel(channel);

            notificationManager.notify(0, notification);
        }else{
            NotificationManager notificationManager = (NotificationManager)
                    this.getSystemService(Context.NOTIFICATION_SERVICE);

            notificationManager.notify(0, notification);
        }

    }

}
