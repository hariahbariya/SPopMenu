package com.example.admin.spopmenu;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle=getIntent().getExtras();
        String s=bundle.getString("uname");
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }
}
