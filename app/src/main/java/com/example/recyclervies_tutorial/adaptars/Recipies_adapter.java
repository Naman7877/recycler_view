package com.example.recyclervies_tutorial.adaptars;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclervies_tutorial.R;
import com.example.recyclervies_tutorial.module.recipies;

import java.util.ArrayList;

public class Recipies_adapter extends RecyclerView.Adapter<Recipies_adapter.viewHolder>
{
    ArrayList<recipies>list;

    public Recipies_adapter(ArrayList<recipies> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;



    @NonNull
    @Override
    public Recipies_adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_recyclerview, parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Recipies_adapter.viewHolder holder, int position) {
    recipies model= list.get(position);
    holder.imageView.setImageResource(model.getPic());
    holder.textView.setText(model.getText());

    /*holder.textView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(context, "for checking onclicklistner in recycler view ", Toast.LENGTH_SHORT).show();
        }
    });
    holder.imageView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(context, "cheaking onclick on image", Toast.LENGTH_SHORT).show();
        }
    });
     */
        switch (position)
        {
            case 0:
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "for checking onclicklistner in recycler view ", Toast.LENGTH_SHORT).show();
                    }
                });

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "cheaking onclick on image", Toast.LENGTH_SHORT).show();
                    }
                });

                break;

            case 1:
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "second text", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

        }

  }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);
        }
    }

}
