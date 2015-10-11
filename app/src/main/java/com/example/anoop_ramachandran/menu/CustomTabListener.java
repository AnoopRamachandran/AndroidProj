package com.example.anoop_ramachandran.menu;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;

/**
 * Created by anoop_ramachandran on 10/11/2015.
 */
public class CustomTabListener<T extends Fragment> implements android.support.v7.app.ActionBar.TabListener {

    private android.support.v4.app.Fragment fragment;
   // private Fragment fragment;
    private final Activity mActivity;
    private final String mTag;
    private final Class<T> mClass;


    public CustomTabListener(Activity activity, String tag, Class<T> _fragment){

        mActivity = activity;
        mTag = tag;
        mClass = _fragment;

    }


    @Override
    public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

        if(fragment==null){
            fragment = android.support.v4.app.Fragment.instantiate(mActivity,mClass.getName());
            //fragment= Fragment.instantiate(mActivity,mClass.getName());
            //ft.add(R.id.content);
            ft.add(android.R.id.content, fragment, mTag);
            //ft.add(android.R.id.content, Fragment.instantiate(mActivity,mClass.getName()), mTag);
        }
        else {
            ft.attach(fragment);
            //ft.attach(Fragment.instantiate(mActivity,mClass.getName()));

        }

    }

    @Override
    public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }
}
