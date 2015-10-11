package com.example.anoop_ramachandran.menu;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;

import com.example.anoop_ramachandran.menu.CustomTabListener;
import com.example.anoop_ramachandran.menu.shopFragment;
import com.example.anoop_ramachandran.menu.updates;

/**
 * Created by anoop_ramachandran on 10/11/2015.
 */
public class ApplicationActivity extends ActionBarActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empty_layout);



        android.support.v7.app.ActionBar _action = getSupportActionBar();
        // android.support.v7.app.ActionBar _action = getSupportActionBar();
        _action.setNavigationMode(android.support.v7.app.ActionBar.NAVIGATION_MODE_TABS);
      //  _action.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        _action.setDisplayShowTitleEnabled(true);

        android.support.v7.app.ActionBar.Tab _tab = _action.newTab()
        //android.support.v7.app.ActionBar _tab = _action.newTab()
                .setText("ShopActivity")

                .setTabListener(new CustomTabListener<shopFragment>(this, "ShopActivity", shopFragment.class));
                _action.addTab(_tab);
        _action.selectTab(_tab);

        android.support.v7.app.ActionBar.Tab _tabupdates = _action.newTab()
                //android.support.v7.app.ActionBar _tab = _action.newTab()
                .setText("Updates")
                .setTabListener(new CustomTabListener<updates>(this, "Updates", updates.class));
        _action.addTab(_tabupdates);
        _action.selectTab(_tabupdates);


        /**   ActionBar.Tab _tab = _action.newTab()
                 .setText("ShopActivity")
                 .setTabListener(new CustomTabListener<shopFragment>(this, "ShopActivity", shopFragment.class));
                 _action.addTab(_tab);
                 _action.selectTab(_tab);

         ActionBar.Tab _tabupdates = _action.newTab()
                 .setText("updates")
                 .setTabListener(new CustomTabListener<updates>(this,"updates",updates.class));
                 _action.addTab(_tabupdates);
                 _action.selectTab(_tabupdates);**/



        }
}
