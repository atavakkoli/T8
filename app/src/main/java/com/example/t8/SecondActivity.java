package com.example.t8;




import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class SecondActivity extends AppCompatActivity {

    // Array of strings...
//    String[] mobileArray = {"Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
/*
        mobileArray[0] = getResources().getString(R.string.List_Item_0);
        mobileArray[1] = getResources().getString(R.string.List_Item_1);
        mobileArray[2] = getResources().getString(R.string.List_Item_2);
        mobileArray[3] = getResources().getString(R.string.List_Item_3);
        mobileArray[4] = getResources().getString(R.string.List_Item_4);
        mobileArray[5] = getResources().getString(R.string.List_Item_5);
        mobileArray[6] = getResources().getString(R.string.List_Item_6);
        mobileArray[7] = getResources().getString(R.string.List_Item_7);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);

        listView.setAdapter(adapter);

*/
    }



}
