package com.wordpress.logitopia.jun20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Phenomeno on 6/26/15.
 */
public class GamePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_game);

        Button button_one, button_two, button_three;

        button_one = (Button)findViewById(R.id.button1);

        button_two = (Button)findViewById(R.id.button2);

        button_three = (Button)findViewById(R.id.button3);



    }


    public void option_one_Click(View view) {
    }

    public void option_two_Click(View view) {
    }

    public void option_three_Click(View view) {
    }

}
