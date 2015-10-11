package com.example.anoop_ramachandran.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by anoop_ramachandran on 10/11/2015.
 */
public class UniqIDGenActivity extends Activity implements View.OnClickListener {

    Button _generate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unique_id);

        _generate = (Button) findViewById(R.id._btnGenerate);
        _generate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id ==R.id._btnGenerate) {
            Intent i = new Intent(UniqIDGenActivity.this, UserAddressInfActivity.class);
            startActivity(i);
            finish();

        }


    }
}
