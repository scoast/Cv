package com.example.s_coast.cv_guiguiwalano;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button buttonCompetence;
    private Button buttonFormation;
    private Button buttonExperience;
    private ImageButton Linkedin;
    private ImageButton Soundcloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCompetence = (Button) findViewById(R.id.Comp_);
        buttonCompetence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToComp_();
            }
        });

        buttonFormation = (Button) findViewById(R.id.Form_);
        buttonFormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToForm_();
            }
        });

        buttonExperience = (Button) findViewById(R.id.Exp_);
        buttonExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToExp_();
            }
        });

        Linkedin = (ImageButton) findViewById(R.id.Linkedin);
        Linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToLinkedin();
            }
        });

        Soundcloud = (ImageButton) findViewById(R.id.Soundcloud);
        Soundcloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToSoundcloud();
            }
        });


    }

    public void GoToComp_(){
        Intent Comp_Int = new Intent(getApplicationContext(), CompetenceActivity.class);
        startActivity(Comp_Int);
    }

    public void GoToForm_(){
        Intent Form_Int = new Intent(getApplicationContext(), FormationActivity.class);
        startActivity(Form_Int);
    }

    public void GoToExp_(){
        Intent Exp_Int = new Intent(getApplicationContext(), ExperienceActivity.class);
        startActivity(Exp_Int);
    }

    public void GoToLinkedin(){
        Uri uri = Uri.parse("https://fr.linkedin.com/in/guillaume-schmitt-056438128"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void GoToSoundcloud(){
        Uri uri = Uri.parse("https://soundcloud.com/s-coast");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }



}
