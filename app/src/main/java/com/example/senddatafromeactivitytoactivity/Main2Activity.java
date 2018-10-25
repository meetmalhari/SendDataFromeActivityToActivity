package com.example.senddatafromeactivitytoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle bundle=getIntent().getBundleExtra("Info");
        Dummy dummy=new Dummy();
        dummy=(Dummy) bundle.getSerializable("value");
try {
    TextView textView = findViewById(R.id.txtView);
    textView.setText(" No : " + dummy.no + "\n Name :" + dummy.name + "\n Age :" + dummy.age);
}catch (Exception e)
{
    Log.e("Info "," Error "+e.getMessage());
}
    }
}
