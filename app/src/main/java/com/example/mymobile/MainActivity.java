package com.example.mymobile;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private ListView lvitem;
    private final String[] namanegara = new String[]{"Indonesia","Malaysia", "Singapore", "Italia", "Inggris", "Belanda", "Argentina", "Chile"};
    private String[] namaibukota = new String[]{"Jakarta", "KualaLumpur", "Singapore", "Roma", "London", "Amsterdam", "Buenos Aires", "Santiago de Chile"};

   // @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Actionbar actionbar = getSupportActionBar();
        getSupportActionBar().setTitle("List View Sederhana");

        lvitem = (ListView)findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.activity_main,R.id.text_view, namanegara);

        lvitem.setAdapter(adapter);

        lvitem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(MainActivity.this, "Negara yang dipilih : " + namanegara[position] + ", " +"Ibukota yang dipilih : " + namaibukota[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}