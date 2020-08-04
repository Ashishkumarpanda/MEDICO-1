package com.example.coderspot;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_list extends  Fragment {
    ArrayList<Folder> list=new ArrayList<Folder>();
    ListView listView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        listView=view.findViewById(R.id.listview);

        Folder folder1=new Folder("CORONA");
        Folder folder2=new Folder("CANCER");
        Folder folder3=new Folder("JAUNDICE");
        Folder folder4=new Folder("MALARIA");
        Folder folder5=new Folder("HEPATITES");
        Folder folder6=new Folder("DENGUE");
        Folder folder7=new Folder("PLAGUE");
        Folder folder8=new Folder("FEVER");
        Folder folder9=new Folder("COLD");
        Folder folder10=new Folder("CONSTIPATION");

        list.add(folder1);
        list.add(folder2);
        list.add(folder3);
        list.add(folder4);
        list.add(folder5);
        list.add(folder6);
        list.add(folder7);
        list.add(folder8);
        list.add(folder9);
        list.add(folder10);

        Adapter adapter=new Adapter(getActivity(),list);
        listView.setAdapter(adapter);



    }

}