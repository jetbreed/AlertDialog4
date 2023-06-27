package com.jetbreed.alertdialog4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void open(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        LayoutInflater inflater = getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.dialog_signin, null))
                // Add action buttons
                .setPositiveButton(R.string.signin, (dialog, id) -> {
                    // sign in the user ...
                    Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton(R.string.signup, (dialog, id) -> {
//                        LoginDialogFragment.this.getDialog().cancel();
                    Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}