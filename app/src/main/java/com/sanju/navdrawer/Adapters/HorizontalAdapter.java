//package com.sanju.navdrawer.Adapters;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.sanju.navdrawer.Gnp20Activity;
//import com.sanju.navdrawer.R;
//import com.sanju.navdrawer.model.HorizontalModel;
//import com.sanju.navdrawer.ui.chat.ChatFragment;
//
//import java.util.List;
//
//public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {
//
//    Context context;
//    List<HorizontalModel> horizontalModelList;
//
//    public HorizontalAdapter(Context context, List<HorizontalModel> horizontalModelList) {
//        this.context = context;
//        this.horizontalModelList = horizontalModelList;
//    }
//
//    @NonNull
//    @Override
//    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View view = LayoutInflater.from(context).inflate(R.layout.horizontal_row_item, parent, false);
//        return new HorizontalViewHolder(view);
//
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
//
//        holder.product1Image.setImageResource(horizontalModelList.get(position).getImageUrl());
//        holder.name.setText(horizontalModelList.get(position).getName());
//        holder.price.setText(horizontalModelList.get(position).getPrice());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(context, Gnp20Activity.class);
//                context.startActivity(i);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return horizontalModelList.size();
//    }
//
//    public static final class HorizontalViewHolder extends RecyclerView.ViewHolder {
//
//        ImageView product1Image;
//        TextView price, name;
//
//        public HorizontalViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            product1Image = itemView.findViewById(R.id.product1_image);
//            price = itemView.findViewById(R.id.price);
//            name = itemView.findViewById(R.id.name);
//        }
//    }
//}
