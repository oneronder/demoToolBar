package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.ana_sayfa_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("AniSend");
        getSupportActionBar().setSubtitle("enjoy the time");
        //getSupportActionBar().setIcon(R.drawable.icon);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.app_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.add_post_send) {
            Toast.makeText(this, "Add Post Send Click Ok!!!", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.settings) {
            Toast.makeText(this, "Settings Click Ok!!!", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.add_comments) {
            Toast.makeText(this, "Comments Click Ok!!!", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
