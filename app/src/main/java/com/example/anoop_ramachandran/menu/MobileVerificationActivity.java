package com.example.anoop_ramachandran.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by anoop_ramachandran on 10/11/2015.
 */
public class MobileVerificationActivity extends Activity implements View.OnClickListener{

    Button _btnVerify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify_mobile);

        _btnVerify = (Button) findViewById(R.id._btnVerify);
        _btnVerify.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id ==R.id._btnVerify) {
            Intent i = new Intent(MobileVerificationActivity.this, UniqIDGenActivity.class);
            startActivity(i);
            finish();

        }

    }
}
