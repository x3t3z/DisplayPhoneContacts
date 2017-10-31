package com.example.kr4k3rz.displaycontacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private int layoutResource;

    ArrayList<Contact> contactArrayList;

    Context context;
    private static LayoutInflater inflater = null;

    public CustomAdapter(MainActivity mainActivity, ArrayList<Contact> contactArrayList) {
        this.context = mainActivity;
        this.contactArrayList = contactArrayList;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public class Holder {
        TextView name;
        TextView phn;
        TextView email;
        ImageView imageView;
    }

    @Override
    public int getCount() {
        return contactArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.list_item, null);
        holder.name = (TextView) rowView.findViewById(R.id.name);
        holder.phn = (TextView) rowView.findViewById(R.id.phone);
        holder.imageView = rowView.findViewById(R.id.picture);
        holder.email = rowView.findViewById(R.id.email);
        Contact contact = contactArrayList.get(position);
        holder.name.setText(contact.getName());
        holder.phn.setText(contact.getPhn());
        holder.email.setText(contact.getEmail());
        holder.imageView.setImageBitmap(contact.getBitmap_picture());


        return rowView;

    }


}
