package pl.rzepka.whereweebean;

        import android.os.Bundle;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ListView;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;

public class AllFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_fragment, container, false);

        ArrayList<Place> allPlaces = Places.getPlaces();

        Collections.sort(allPlaces, new Comparator<Place>() {
            public int compare(Place place1, Place place2) {
                return place1.getmName().compareTo(place2.getmName());
            }
        });

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(new PlaceAdapter(getActivity(), allPlaces));

        return rootView;
    }
}