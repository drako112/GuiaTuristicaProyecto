package com.example.guiaturistica;
import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ThirdActivity extends Activity {
    ListView lv;
       String[] planets = new String[] { "Arequipa", "Lima", "Moquegua", "Tacna"  
    };    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);
        lv=(ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, planets);

              // Assign adapter to ListView
              lv.setAdapter(adapter);

              lv.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1,
                        int position, long arg3) {
                    // TODO Auto-generated method stub
                     int itemPosition     = position;

                       // ListView Clicked item value
                       String  itemValue    = (String) lv.getItemAtPosition(position);

                        // Show Alert 
                        Toast.makeText(getApplicationContext(),
                          "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                          .show();
                }
            });
    }
}