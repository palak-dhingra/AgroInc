package com.example.palakdhingra.agroinc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AgricultureLib extends AppCompatActivity {
    private ArrayList<SectionDataModel> allSampleData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture_lib);

        allSampleData = new ArrayList<>();

        createDummyData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(allSampleData, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }
    private void createDummyData() {

            ArrayList<SingleItemModel> singleItemModels = new ArrayList<>();
            for (int j = 1; j <= 8; j++) {
                singleItemModels.add(new SingleItemModel("Item " + j, "URL " + j));
            }
            SectionDataModel [] dm= new SectionDataModel[5];
            dm[0]= new SectionDataModel("pulses",singleItemModels);
            dm[1]=new SectionDataModel("fruits",singleItemModels);
            dm[2]=new SectionDataModel("cereals",singleItemModels);
            dm[3]=new SectionDataModel("vegetables",singleItemModels);
            dm[4]=new SectionDataModel("spices",singleItemModels);
            allSampleData.add(dm[0]);
            allSampleData.add(dm[1]);
            allSampleData.add(dm[2]);
            allSampleData.add(dm[3]);
            allSampleData.add(dm[4]);


    }
}
