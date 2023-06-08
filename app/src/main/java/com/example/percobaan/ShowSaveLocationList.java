package com.example.percobaan;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowSaveLocationList extends AppCompatActivity {
    ListView lv_savedlocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_save_location_list);

        lv_savedlocations = findViewById(R.id.lv_wayPoints);

        MyApplication myApplication =(MyApplication)getApplicationContext();
        List<Location> savedLocations = myApplication.getMyLocations();

        lv_savedlocations.setAdapter(new ArrayAdapter<Location>(this, android.R.layout.simple_list_item_1, savedLocations));
    }
}