package com.example.palakdhingra.agroinc;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShowAgriData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_agri_data);
        TextView header1 = (TextView) findViewById(R.id.header1data);
        header1.setText(getIntent().getStringExtra("header1"));

        TextView header2 = (TextView) findViewById(R.id.header2data);
        header2.setText((getIntent().getStringExtra("header2")));

        TextView header3 = (TextView) findViewById(R.id.header3data);
        header3.setText((getIntent().getStringExtra("header3")));

        TextView header4 = (TextView) findViewById(R.id.header4data);
        header4.setText((getIntent().getStringExtra("header4")));

        TextView header5 = (TextView) findViewById(R.id.header5data);
        header5.setText((getIntent().getStringExtra("header5")));

        TextView header6 = (TextView) findViewById(R.id.header6data);
        header6.setText((getIntent().getStringExtra("header6")));

        ImageView imageView = (ImageView) findViewById(R.id.imageAgri);
        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("image");
        imageView.setImageResource(pic);


    }
}
