package com.example.user1.firebasetestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;
    private Button Logout;
    private Button DailyBulletin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() == null){
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }

        FirebaseUser user = firebaseAuth.getCurrentUser();


        Logout = (Button) findViewById(R.id.Logout);
        Logout.setOnClickListener(this);

        DailyBulletin = (Button) findViewById(R.id.DailyBulletin);
        DailyBulletin.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view == Logout){
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }
        if(view == DailyBulletin){
            finish();
            startActivity(new Intent(this, Main4Activity.class));
        }
    }
}
