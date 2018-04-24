package pl.rzepka.whereweebean;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FoodFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_fragment, container, false);

        ArrayList<Place> foodPlaces = Places.getPlacesFromCategory("Food");

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(new PlaceAdapter(getActivity(), foodPlaces));

        return rootView;
    }
}