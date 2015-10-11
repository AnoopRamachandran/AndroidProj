package com.example.anoop_ramachandran.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by anoop_ramachandran on 10/11/2015.
 */
public class CreateAccountActivity extends Activity implements View.OnClickListener {

    Button _btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);

        _btnRegister = (Button) findViewById(R.id._btnRegister);
        _btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id ==R.id._btnRegister) {
            Intent i = new Intent(CreateAccountActivity.this, MobileVerificationActivity.class);
            startActivity(i);
            finish();

        }
    }
}
