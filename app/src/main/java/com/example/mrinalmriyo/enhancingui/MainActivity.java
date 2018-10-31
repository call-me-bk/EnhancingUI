package com.example.mrinalmriyo.enhancingui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    LinearLayout linearLayout;

    public void listenMe(View view)
    {
        linearLayout.setVisibility(View.GONE);
        textView.setVisibility(View.VISIBLE);
        Toast.makeText(this, "Events", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId())
        {
            case R.id.settings:
                Toast.makeText(this, "Settings tapped",
                        Toast.LENGTH_SHORT).show();
                setTitle("Settings");
                return true;
            case R.id.help:
                Toast.makeText(this, "Help Tapped",
                        Toast.LENGTH_SHORT).show();
                setTitle("Help");
                return true;
                default:
                    return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        linearLayout=findViewById(R.id.linearLayout);
    }
}
