package com.example.admin.spopmenu;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

   AlertDialog.Builder builder;
    final String[] colors = {"red", "green", "yellow","black"};

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder=new AlertDialog.Builder(this);

        final Button button=(Button)findViewById(R.id.Btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ArrayList arrayList=new ArrayList<String>();

                builder.setMultiChoiceItems(colors, null, new DialogInterface.OnMultiChoiceClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int selectedItemId, boolean selected) {

                      if(selected)
                      {
                          arrayList.add(colors[selectedItemId]);
                      }
                      else if(arrayList.contains(selectedItemId))
                      {
                          arrayList.remove(Integer.valueOf(selectedItemId));
                      }
                  }
              });

              AlertDialog alertDialog=builder.create();
              alertDialog.show();
            }
        });
    }
}
