package com.wordpress.logitopia.jun20;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            /** Initialize ImageViews and TextViews **/

        TextView playGameText, quitGameText;
        ImageView yesImageView, noImageView;

        playGameText = (TextView) findViewById(R.id.play_Game_Text_id);
//        playGameText.setRotation(90);

        quitGameText = (TextView) findViewById(R.id.quit_Game_Text_id);
//        quitGameText.setRotation(90);

        yesImageView = (ImageView) findViewById(R.id.YesImageView);
        noImageView = (ImageView) findViewById(R.id.NoImageView);
    }

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void OpenGamePageClick(View view) {

        Intent openPage = new Intent(view.getContext(),GamePage.class);
        startActivity(openPage);
    }

    public void ExitAppClick(View view) {

        System.exit(0);
    }
}
