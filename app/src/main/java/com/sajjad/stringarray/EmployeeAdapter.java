package com.sajjad.stringarray;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class EmployeeAdapter extends ArrayAdapter<String> {

    private Context context;
    private String[] employeeNames;

    EmployeeAdapter(Context context, String[] employeeNames) {
        super(context, 0, employeeNames);
        this.context = context;
        this.employeeNames = employeeNames;
    }

    @Override
    public int getCount() {
        return employeeNames.length;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, null);
        }

        TextView employeeName = view.findViewById(R.id.employee_name);

        employeeName.setText(employeeNames[position]);

        return view;
    }
}