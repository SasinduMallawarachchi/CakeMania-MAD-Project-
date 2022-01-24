package com.CakeMania.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseOne extends AppCompatActivity {

    Button Chef, Customer, DeliveryPerson;
    Intent intent;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);
        Chef = (Button) findViewById(R.id.chef);
//        DeliveryPerson = (Button) findViewById(R.id.delivery);
        Customer = (Button) findViewById(R.id.customer);


        intent = getIntent();
        type = intent.getStringExtra("Home").toString().trim();

        Chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (type.equals("Email")) {
                    Intent loginemail = new Intent(ChooseOne.this, ChefLogin.class);
                    startActivity(loginemail);
                    finish();
                }

                if (type.equals("SignUp")) {
                    Intent Register = new Intent(ChooseOne.this, ChefRegisteration.class);
                    startActivity(Register);


                }

            }
        });

        Customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (type.equals("Email")) {
                    Intent loginemailcust = new Intent(ChooseOne.this, Login.class);
                    startActivity(loginemailcust);
                    finish();
                }

                if (type.equals("SignUp")) {
                    Intent Registercust = new Intent(ChooseOne.this, Registeration.class);
                    startActivity(Registercust);
                }
            }
        });

    }
}
