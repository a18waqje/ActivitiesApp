package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    //private static final android.util.Log Log = ;
    private String[] mountainNames = {"Matterhorn", "Mont Blanc", "Denali"};
    private String[] mountainLocations = {"Alps", "Alps", "Alaska"};
    private int[] mountainHeights = {4478, 4808, 6190};

    // Create ArrayLists from the raw data above and use these lists when populating your ListView.


    private ArrayList<Mountain> waqarsBerg = new ArrayList<>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        waqarsBerg.add(new Mountain("Matterhorn", "Alps", 4478));
        waqarsBerg.add(new Mountain("Mont Blanc", "Alps", 4808));
        waqarsBerg.add(new Mountain("Denali", "Alaska", 6190));
        Log.d("WAQAR", waqarsBerg.get(0).getName());

        ArrayAdapter<Mountain> adapter = new ArrayAdapter<Mountain>(this, R.layout.list_item_textview, R.id.list_item_textview, waqarsBerg);
        // 3. Create an ArrayAdapter object that connects
        ListView my_listview = (ListView) findViewById(R.id.my_listview);
        //    * list_item_textview
        //    * my_item_textview
        //    * List object created in step 2
        // 4. Find the ListView layout element "my_listview" and create an object instance
        my_listview.setAdapter(adapter);
        my_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               /* Toast.makeText(getApplicationContext(), waqarsBerg.get(position).info(), Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(getApplicationContext(), detaljer.class);
                intent.putExtra("BERG_NAMN" , waqarsBerg.get(position).toString());
                intent.putExtra( "BERG_HEIGHT", waqarsBerg.get(position).getheight());
                intent.putExtra( "BERG_LOCATION", waqarsBerg.get(position).getlocation());
                startActivity(intent);

            }
        });
   /* public void launchSecondActivity(View view) {
        this.view = view;
        Log.d(LOG_TAG, "Button clicked!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Log.d("brom", "onCreate() called.");
        //Button b = (Button) findViewById(R.id.startaDetaljer);
        //b.setText("Starta Detaljer");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View view) {
                Snackbar.make(view, "Replace with you own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d("brom","onStop() called.");
    }
*/

        // 1. Create a ListView as in previous assignment
        // 2. Create a new activity named "MountainDetailsActivity
        // 3. Create a new Layout file for the MountainDetailsActivity called
        //    "activity_mountaindetails". MountainDetailsActivity must have MainActivity as its
        //    ´parent activity.
        // 4. The layout file created in step 3 must have a LinearLayout
        // 5. The layout file created in step 3 must be able to display
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 6. When tapping on a list item: create an Intent that includes
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 7. Display the MountainDetailsActivity with the data from the Intent created in step
        //    6
        // 8. From the MountainDetailsActivity you should have an option to "go back" using an
        //    left arro button. This is done by letting the MainActivity be the parent activity to
        //    MountainDetailsActivity.
    }
}
