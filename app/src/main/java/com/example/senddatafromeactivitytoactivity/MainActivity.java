package com.example.senddatafromeactivitytoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dummy  dummy=new Dummy(1,"Malhari",26);

        Intent intent=new Intent(MainActivity.this,Main2Activity.class);

        Bundle bundle=new Bundle();
        bundle.putSerializable("value",dummy);

        intent.putExtra("Info",bundle);

        startActivity(intent);

    }
}
