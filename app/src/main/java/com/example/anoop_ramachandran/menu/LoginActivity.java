package com.example.anoop_ramachandran.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by anoop_ramachandran on 10/10/2015.
 */
public class LoginActivity extends Activity implements View.OnClickListener {

    Button _btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        _btnLogin = (Button) findViewById(R.id._btnLogin);
        _btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

       /** int id = v.getId();
        if(id ==R.id._btnLogin) {
            Intent i = new Intent(LoginActivity.this, ApplicationActivity.class);
            startActivity(i);
            finish();**/

        

    }
}
