package com.example.edutube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class c_document extends AppCompatActivity {

    RecyclerView recyclerView;
    List<recyclerview_version> versionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdocument);

        recyclerView = findViewById(R.id.recyclerview);

        initData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        recyclerview_version_adapter version_adapter = new recyclerview_version_adapter(versionList);
        recyclerView.setAdapter(version_adapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {

        versionList = new ArrayList<>();

        versionList.add(new recyclerview_version("top text","version-01","api level-01","description of the app"));
        versionList.add(new recyclerview_version("top text1","version-02","api level-02","description of the second app"));
        versionList.add(new recyclerview_version("top text2","version-03","api level-03","description of the third app"));
        versionList.add(new recyclerview_version("top text","version-04","api level-01","description of the app"));
        versionList.add(new recyclerview_version("top text1","version-05","api level-02","description of the second app"));
        versionList.add(new recyclerview_version("top text2","version-06","api level-03","description of the third app"));

        versionList.add(new recyclerview_version("top text","version-07","api level-01","description of the app"));
        versionList.add(new recyclerview_version("top text1","version-08","api level-02","description of the second app"));
        versionList.add(new recyclerview_version("top text2","version-09    ","api level-03","description of the third app"));

    }
}