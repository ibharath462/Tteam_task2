package com.example.bharath.tteam_task2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class vlist extends ActionBarActivity {
    ListView l;
    TextView ttt;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlist);
        l = (ListView) findViewById(R.id.l);
        b1=(Button)findViewById(R.id.b1);
        ttt = (TextView) findViewById(R.id.ttt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(v.getContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        String[] values = new String[]{"K!", "K!arnival", "Projects",
                "ROS", "K!ore", "Chaos theory", "Krithi", "Marketting Madness",
                "Shoerlock", "Athena", "Coding Hungama", "Hackathon", "TCS Innovate", "Robowars",
                "Paper Presentation", "BIM", "God Speed", "E-zone", "Contraptions", "Alcatraz",
                "Dalal Bull", "Sci-Tech Quiz", "School quiz"};
        ArrayAdapter<String> adap = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        l.setAdapter(adap);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        ttt.setText("Welcome to K!");
                        break;
                    case 1:
                        ttt.setText("The highlight of K!, where many pro shows such as laser tag happen.!");
                        break;
                    case 2:
                        ttt.setText("Where creativity meets social responsibility");
                        break;
                    case 3:
                        ttt.setText("Mother of all treaure-hunts ");
                        break;
                    case 4:
                        ttt.setText("The force behind K!");
                        break;
                    case 5:
                        ttt.setText("One for marketting geeks");
                        break;
                    case 6:
                        ttt.setText("Innovative workshop for school students ");
                        break;
                    case 7:
                        ttt.setText("Another one for marketting geeks");
                        break;
                    case 8:
                        ttt.setText("You will be Sherlocked ");
                        break;
                    case 9:
                        ttt.setText("Show your math skills");
                        break;
                    case 10:
                        ttt.setText("All for the coding geeks");
                        break;
                    case 11:
                        ttt.setText("All night food and code");
                        break;
                    case 12:
                        ttt.setText("Show off your new skills @ TCS");
                        break;
                    case 13:
                        ttt.setText("Wrestling of the man made machines");
                        break;
                    case 14:
                        ttt.setText("Present your paper :p");
                        break;
                    case 15:
                        ttt.setText("Some civil stuff");
                        break;
                    case 16:
                        ttt.setText("wooo,wooo, the race of the RC cars");
                        break;
                    case 17:
                        ttt.setText("All for the ECE nerds");
                        break;
                    case 18:
                        ttt.setText("Remember Appu Kamalhasan???");
                        break;
                    case 19:
                        ttt.setText("Tease your grey matter and escape from alcatraz ");
                        break;
                    case 20:
                        ttt.setText("Want to be next Jorden Belfort");
                        break;
                    case 21:
                        ttt.setText("Know halo lens and cortana, then this is for u!!");
                        break;
                    case 22:
                        ttt.setText("Quiz for school students");
                        break;
                    default:
                        ttt.setText("K!16");
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vlist, menu);
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
}
