package com.example.s_coast.jsaispas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button buttonDemarrage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDemarrage = (Button) findViewById(R.id.start_);
        buttonDemarrage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToChat_();
            }
        });
    }

    public void GoToChat_(){
        Intent Chat_Int = new Intent(getApplicationContext(), ListChatActivity.class);
        startActivity(Chat_Int);
    }
}
