package pl.rzepka.whereweebean;

import android.app.Activity;
import android.content.res.Resources;

import java.util.ArrayList;

public class Places {

    private static ArrayList<Place> places = new ArrayList<>();

    public static ArrayList<Place> getPlaces() {
        return places;
    }

    public static void addToPlacesLibrary(Place placeToAdd) {
        boolean placeAlreadyInLibrary = false;
        for (Place place : places) {
            if (place.getmName().equals(placeToAdd.getmName())) {
                placeAlreadyInLibrary = true;
            }
        }
        if (!placeAlreadyInLibrary) {
            places.add(placeToAdd);
        }
    }

    public static ArrayList getPlacesFromCategory(String category) {
        ArrayList<Place> placesFound = new ArrayList<>();
        for (Place place : places) {
            if (place.getmCategory().equals(category)) {
                placesFound.add(place);
            }
        }
        return placesFound;
    }
}