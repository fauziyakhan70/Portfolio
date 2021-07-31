package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button github,linkedin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        github=(Button)findViewById(R.id.opengithub);
        linkedin=(Button)findViewById(R.id.openlinkedin);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://github.com/fauziyakhan70"));
                startActivity(i);}
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i=new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.linkedin.com/in/fauziya-khan-0343b51b6/"));
                startActivity(i);
            }
        });
    }
}