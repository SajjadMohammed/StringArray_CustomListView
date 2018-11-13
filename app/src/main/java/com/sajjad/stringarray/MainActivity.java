package com.sajjad.stringarray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView employeeListView;
    Toolbar v7Toolbar;
    EmployeeAdapter employeeAdapter;
    String[] employeeNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        v7Toolbar = findViewById(R.id.showCustom);
        setSupportActionBar(v7Toolbar);
        //

        // get names from string-array
        employeeNames = getResources().getStringArray(R.array.employee_array);

        employeeListView = findViewById(R.id.employee_listview);

        employeeAdapter = new EmployeeAdapter(this, employeeNames);
        employeeListView.setAdapter(employeeAdapter);

        employeeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String name = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), employeeNames[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
