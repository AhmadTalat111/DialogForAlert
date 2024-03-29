package com.example.android.dialogforalert;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(
                MainActivity.this);
        myAlertBuilder.setTitle(getString(R.string.alert_title));
        myAlertBuilder.setMessage(getString(R.string.alert_message));
        myAlertBuilder.setPositiveButton("OK", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        Toast.makeText(getApplicationContext(), R.string.ok_button,
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.setNegativeButton("Cancel", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), R.string.cancel_button
                                , Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.show();
    }
}
