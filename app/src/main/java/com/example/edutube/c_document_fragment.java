package com.example.edutube;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class c_document_fragment extends Fragment {

    RecyclerView recyclerView;
    List<recyclerview_version> versionList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_c_document_fragment, container, false);

        recyclerView = v.findViewById(R.id.recyclerview);

        initData();
        setRecyclerView();



    return v;
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