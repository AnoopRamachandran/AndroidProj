package com.example.anoop_ramachandran.menu;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by anoop_ramachandran on 10/11/2015.
 */
public class shopFragment extends ListFragment {

    String country[] = new String[]{
            "USA", "India"
    };

    /** int[] flags = new int[]{
     R.drawable._usa,
     R.drawable._india
     };**/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        /** List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
         for (int i = 0; i < 10; i++) {
         HashMap<String, String> hm = new HashMap<String, String>();
         hm.put("txt", "Country : " + country[i]);
         hm.put("flag", Integer.toString(flags[i]));
         aList.add(hm);
         }

         String[] from = {"flag", "txt"};

         // Ids of views in listview_layout
         int[] to = {R.id.flag, R.id.txt};

         // ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(),android.R.layout.simple_list_item_multiple_choice,country);
         SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);
         **/

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_multiple_choice,country);

        setListAdapter(adapter);


        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
}