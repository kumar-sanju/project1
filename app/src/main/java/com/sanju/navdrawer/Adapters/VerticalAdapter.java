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
//import com.sanju.navdrawer.Gnp20Activity;
//import com.sanju.navdrawer.R;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.sanju.navdrawer.model.VerticalModel;
//import com.sanju.navdrawer.ui.chat.ChatFragment;
//
//import java.util.List;
//
//public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder> {
//
//    Context context;
//    List<VerticalModel> verticalModelList;
//
//    public VerticalAdapter(Context context, List<VerticalModel> verticalModelList) {
//        this.context = context;
//        this.verticalModelList = verticalModelList;
//    }
//
//    @NonNull
//    @Override
//    public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View view = LayoutInflater.from(context).inflate(R.layout.vertical_row_item, parent, false);
//        return new VerticalViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder( VerticalViewHolder holder, int position) {
//
//        holder.productImage.setImageResource(verticalModelList.get(position).getImageUrl());
//        holder.name.setText(verticalModelList.get(position).getName());
//        holder.price.setText(verticalModelList.get(position).getPrice());
//        holder.rating.setText(verticalModelList.get(position).getRating());
//        holder.companyName.setText(verticalModelList.get(position).getRestorantname());
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
//        return verticalModelList.size();
//    }
//
//    public static final class VerticalViewHolder extends RecyclerView.ViewHolder{
//
//        ImageView productImage;
//        TextView price, name, rating, companyName;
//
//        public VerticalViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            productImage = itemView.findViewById(R.id.product_image);
//            price = itemView.findViewById(R.id.price);
//            name = itemView.findViewById(R.id.name);
//            rating = itemView.findViewById(R.id.rating);
//            companyName = itemView.findViewById(R.id.company_name);
//
//        }
//    }
//}
