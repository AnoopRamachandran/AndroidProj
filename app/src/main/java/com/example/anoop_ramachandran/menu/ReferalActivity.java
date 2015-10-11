package com.example.anoop_ramachandran.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by anoop_ramachandran on 10/11/2015.
 */
public class ReferalActivity extends Activity implements View.OnClickListener {

    Button _verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.referal_activity);

        _verify = (Button) findViewById(R.id._btnVerify);
        _verify.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id ==R.id._btnVerify) {
            Intent i = new Intent(ReferalActivity.this, CreateAccountActivity.class);
            startActivity(i);
            finish();

        }

    }
}
