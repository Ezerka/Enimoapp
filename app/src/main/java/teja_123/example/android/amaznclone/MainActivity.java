package teja_123.example.android.amaznclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myweb=(WebView) findViewById(R.id.mywebview);
        myweb.getSettings().setJavaScriptEnabled(true);
        myweb.setWebViewClient(new WebViewClient());
        myweb.loadUrl("https://enimo.ezerka.in/");

        Log.d("check", String.valueOf(myweb));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
Intent aboutus=new Intent(this, aboutus.class);
startActivity(aboutus);

                break;
            case R.id.item2:
                Intent contus=new Intent(this, contactus.class);
                startActivity(contus);
                break;
        }
        return true;
    }
    }

