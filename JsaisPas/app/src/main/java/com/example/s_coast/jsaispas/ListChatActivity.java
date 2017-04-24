package com.example.s_coast.jsaispas;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

/**
 * Created by S-Coast on 19/04/2017.
 */

public class ListChatActivity extends Activity {
    Button button;
    Activity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_salon);

        activity = this;
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = getLayoutInflater();
                final View view= inflater.inflate(R.layout.formsalon,null);

                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setView(view)
                        .setNeutralButton("Créer un salon", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                View editText= view.findViewById(R.id.salonname);
                            }
                        })
                        .setNegativeButton("annuler", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // User cancelled the dialog
                            }
                        });
                // Create the AlertDialog object and return it
                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });


    }
}
