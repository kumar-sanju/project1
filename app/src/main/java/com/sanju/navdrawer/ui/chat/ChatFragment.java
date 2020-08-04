//package com.sanju.navdrawer.ui.chat;
//
//import android.content.Context;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.fragment.app.Fragment;
//
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.sanju.navdrawer.Adapters.HorizontalAdapter;
//import com.sanju.navdrawer.Adapters.VerticalAdapter;
//import com.sanju.navdrawer.R;
//import com.sanju.navdrawer.model.HorizontalModel;
//import com.sanju.navdrawer.model.VerticalModel;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ChatFragment extends Fragment {
//
//    RecyclerView popularHorizontalRecycler, verticalRecycler;
//    HorizontalAdapter horizontalAdapter;
//    VerticalAdapter verticalAdapter;
//    private ChatFragment ChatFragment;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View fragmentView = inflater.inflate(R.layout.fragment_chat, container, false);
//        popularHorizontalRecycler = fragmentView.findViewById(R.id.popular_recycler);
//        verticalRecycler = fragmentView.findViewById(R.id.asia_recycler);
//
//        List<HorizontalModel> horizontalModelList = new ArrayList<>();
//
//        horizontalModelList.add(new HorizontalModel("Gold Nanoparticles EyeRa(TM)GNR 20", "$23.99", R.drawable.gnp20));
//        horizontalModelList.add(new HorizontalModel("Gold Nanoparticles EyeRa(TM)GNP 30", "$133.16", R.drawable.gnr30));
//        horizontalModelList.add(new HorizontalModel("Gold Nanoparticles EyeRa(TM)GNP 40", "$79.97", R.drawable.gnp40));
//        horizontalModelList.add(new HorizontalModel("Gold Nanoparticles EyeRa(TM)GNP 50", "$66.68", R.drawable.gnr50));
//        horizontalModelList.add(new HorizontalModel("Gold Nanoparticles EyeRa(TM)GNR 20", "$23.99", R.drawable.gnp20));
//        horizontalModelList.add(new HorizontalModel("Gold Nanoparticles EyeRa(TM)GNP 30", "$133.16", R.drawable.gnr30));
//
//        setPopularRecycler(horizontalModelList);
//
//        List<VerticalModel> verticalModelList = new ArrayList<>();
//        verticalModelList.add(new VerticalModel("Gold Nanoparticles EyeRa(TM)GNR 20", "$23.99", R.drawable.gnp20, "4.5", "Prantae Solutions"));
//        verticalModelList.add(new VerticalModel("Gold Nanoparticles EyeRa(TM)GNR 30", "$133.16", R.drawable.gnr30, "4.2", "Prantae Solutions"));
//        verticalModelList.add(new VerticalModel("Gold Nanoparticles EyeRa(TM)GNR 40", "$79.97", R.drawable.gnp40, "4.5", "Prantae Solutions"));
//        verticalModelList.add(new VerticalModel("Gold Nanoparticles EyeRa(TM)GNR 50", "$66.68", R.drawable.gnr50, "4.2", "Prantae Solutions"));
//        verticalModelList.add(new VerticalModel("Gold Nanoparticles EyeRa(TM)GNR 20", "$23.99", R.drawable.gnp20, "4.5", "Prantae Solutions"));
//        verticalModelList.add(new VerticalModel("Gold Nanoparticles EyeRa(TM)GNR 30", "$133.16", R.drawable.gnr30, "4.2", "Prantae Solutions"));
//
//        setAsiaRecycler(verticalModelList);
//
//        return fragmentView;
//    }
//
//    private void setPopularRecycler(List<HorizontalModel> horizontalModelList) {
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ChatFragment, RecyclerView.HORIZONTAL, false);
//        popularHorizontalRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
//        horizontalAdapter = new HorizontalAdapter(Context, horizontalModelList);
//        popularHorizontalRecycler.setAdapter(horizontalAdapter);
//
//
//    }
//
//    private void setAsiaRecycler(List<VerticalModel> verticalModelList) {
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ChatFragment, RecyclerView.VERTICAL, false);
//        popularHorizontalRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
//        verticalAdapter = new VerticalAdapter(Context, verticalModelList);
//        verticalRecycler.setAdapter(verticalAdapter);
//
//    }
//
//}