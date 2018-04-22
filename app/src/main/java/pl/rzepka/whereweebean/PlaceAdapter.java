package pl.rzepka.whereweebean;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_item, parent, false);
        }

        final Place currentPlace = getItem(position);

        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photo_image);
        photoImageView.setImageResource(currentPlace.getmPhoto());
        TextView nameTextView = (TextView) convertView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getmName());
        TextView addressTextView = (TextView) convertView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentPlace.getmAddress());
        TextView contactTextView = (TextView) convertView.findViewById(R.id.contact_text_view);
        contactTextView.setText(currentPlace.getmContact());

        return convertView;
    }

}
