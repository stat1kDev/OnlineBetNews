package ru.onlinebet.onlinebetnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BukmekersAdapter extends ArrayAdapter<Bukmekers> {

    private LayoutInflater inflater;
    private int layout;
    private List<Bukmekers> bukmeker;

    public BukmekersAdapter(Context context, int resource, List<Bukmekers> bukmeker) {
        super(context, resource, bukmeker);
        this.bukmeker = bukmeker;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(this.layout, parent, false);

        TextView bukNumber = view.findViewById(R.id.number_buk);
        ImageView bukName = view.findViewById(R.id.list_view_image_item1);
        ImageView bukStars = view.findViewById(R.id.list_view_image_item2);

        Bukmekers bukmekers = bukmeker.get(position);

        bukNumber.setText(bukmekers.getNumber());
        bukName.setImageResource(bukmekers.getBukName());
        bukStars.setImageResource(bukmekers.getBukStars());

        return view;
    }
}
