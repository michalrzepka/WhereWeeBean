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

public class MuseumsFragment extends Fragment {

    private final static String TAG = "Museums";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.museums_fragment, container, false);

        ArrayList<Place> museumPlaces = Places.getPlacesFromCategory("Museum");

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(new PlaceAdapter(getActivity(), museumPlaces));

        return rootView;
    }
}
