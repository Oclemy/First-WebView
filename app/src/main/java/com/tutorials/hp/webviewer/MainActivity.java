package com.tutorials.hp.webviewer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        webView= (WebView) findViewById(R.id.myWebview);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    /*
    LOAD WEBSITE
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.urlID) {
            //LOAD FROM URL
            webView.loadUrl("http://camposha.info");

            return true;
        }else if (id == R.id.assetsID) {

            //LOAD FROM ASSETS
            webView.loadUrl("file:///android_asset/Campo.html");

            return true;
        }else if (id == R.id.stringID) {

            //LOAD FROM STRING
            String html="<html><title></title><body>" +
                    "<h1><u>Programming Languages</u></h1>" +
                    "Below are some languages check them out: " +
                    "<ol>" +
                    "<li>Java</li><li>C#</li><li>C++</li><li>Python</li><li>PHP</li><li>Perl</li>" +
                    "</ol>" +
                    "</body></html>";
            webView.loadData(html,"text/html","UTF-8");

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
