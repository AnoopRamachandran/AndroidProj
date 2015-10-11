package com.example.anoop_ramachandran.menu;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener{

     Button _Login;
    Button _createAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _Login= (Button) findViewById(R.id._btnLogin);
        _Login.setOnClickListener(this);

        _createAccount = (Button) findViewById(R.id._btnAccount);
        _createAccount.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id ==R.id._btnLogin){
            Intent i = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(i);
            finish();
        }

        else if(id ==R.id._btnAccount){
            Intent i = new Intent(MainActivity.this,ReferalActivity.class);
            startActivity(i);
            finish();
        }

    }
}
