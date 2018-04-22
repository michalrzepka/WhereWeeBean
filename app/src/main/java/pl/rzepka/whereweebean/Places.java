package pl.rzepka.whereweebean;

import java.util.ArrayList;

public class Places {

    private static ArrayList<Place> places = new ArrayList<>();

    public static ArrayList<Place> getPlaces() {
        return places;
    }

    public static void populatePlacesLibrary() {
        new Place("Food", "Jeff's American Steak House", "ul. Rostafińskich 1",
                "+48 22 825 16 50", R.drawable.jeffs);
        new Place("Food", "Berek Grill", "ul. Jasna 13",
                "+48 22 826 25 10", R.drawable.berek);
        new Place("Food", "Amrit", "ul. Marszałkowska 136",
                "+48 22 262 12 12", R.drawable.amrit);
        new Place("Food", "Dos Tacos", "ul. Jasna 11",
                "+48 22 243 46 18", R.drawable.dostacos);
        new Place("Food", "The Cool Cat", "ul. Solec 38",
                "+48 578 985 921", R.drawable.thecoolcat);

        new Place("Cinema", "Atlantic", "ul. Chmielna 59",
                "www.kinoatlantic.pl", R.drawable.atlantic);
        new Place("Cinema", "Multikino", "al. KEN 123",
                "www.multikino.pl", R.drawable.multikino);
        new Place("Cinema", "Cinema City", "ul. Poleczki 21",
                "www.cinemacity.pl", R.drawable.cinemacity);
        new Place("Cinema", "Kino Praha", "ul. Rabarbar 2",
                "www.kinopraha.pl", R.drawable.kinopraha);
        new Place("Cinema", "Kino Kultura", "ul. Widok 1",
                "www.kinokultura.pl", R.drawable.kinokultura);


        new Place("Museum", "Galeria Sztuki Zachęta", "pl. Stanisława Małachowskiego 3",
                "zacheta.art.pl", R.drawable.zacheta);
        new Place("Museum", "Muzeum Narodowe", "al. Jerozolimskie 3",
                "mnw.art.pl", R.drawable.muzeumnarodowe);
        new Place("Museum", "Muzeum Powstania Warszawskiego", "ul. Grzybowska 79 ",
                "1944.pl", R.drawable.muzeumpw);
        new Place("Museum", "Zamek Królewski", "pl. Zamkowy 4",
                "zamek-krolewski.pl", R.drawable.zamekkrolewski);
        new Place("Museum", "Muzeum Techniki", "pl. Defilad 1",
                "mtip.pl", R.drawable.muzeumtechniki);

        new Place("Event", "Bieg Niepodległości", "ul. Słomińskiego 5",
                "biegniepodleglosci.waw.pl", R.drawable.biegniepodleglosci);
        new Place("Event", "Bieg Konstytucji", "ul. Marszałkowska 4",
                "biegkonstytucji.waw.pl", R.drawable.biegkonstytucji);
        new Place("Event", "Bieg Powstania Warszawskiego", "ul. Grzybowska 79",
                "biegpw.waw.pl", R.drawable.biegpowstania);
        new Place("Event", "ORLEN Warsaw Marathon", "ul. Francuska 1",
                "orlenmarathon.pl", R.drawable.orlenmarathon);
        new Place("Event", "PZU Półmaraton Warszawski", "ul. Andersa 13",
                "pzupolmaratonwarszawski.com", R.drawable.pzupolmaraton);

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

