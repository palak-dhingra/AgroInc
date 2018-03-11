package com.example.palakdhingra.agroinc;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        TextView agricultureTextView = (TextView) rootView.findViewById(R.id.agriculture_text_view);

        agricultureTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),AgricultureLib.class);
                startActivity(i);
            }
        });

        TextView settingTextView = (TextView) rootView.findViewById(R.id.setting_text_view);

        settingTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),SettingActivity.class);
                startActivity(i);
            }
        });
        return rootView;
    }

}

