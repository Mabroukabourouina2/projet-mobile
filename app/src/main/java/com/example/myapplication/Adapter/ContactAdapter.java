package com.example.myapplication.Adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Domain.Contact;
import com.example.myapplication.R;

import java.time.Instant;
import java.util.ArrayList;

public class ContactAdapter  extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    ArrayList<Contact>items;
    Contact contact;
    private Instant Glide;

    public ContactAdapter(ArrayList<Contact> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_contact,parent,false);
        return  new ViewHolder(inflate);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {
        holder.titleTxt.setText(items.get(position).getName());
        int drawbleRessource=holder.itemView.getResources().getIdentifier(items.get(position).getPicAddress(),
                "drawable",holder.itemView.getContext().getPackageName());




    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titleTxt;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTxt=itemView.findViewById(R.id.titleTxt);
            pic=itemView.findViewById(R.id.pic);
        }
    }
}
