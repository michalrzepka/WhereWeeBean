package pl.rzepka.whereweebean;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private PlacesFragmentAdapter mPlacesFragmentAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populatePlacesLibrary();

        mPlacesFragmentAdapter = new PlacesFragmentAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        PlacesFragmentAdapter adapter = new PlacesFragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new AllFragment(),  getString(R.string.categoryAll));
        adapter.addFragment(new FoodFragment(), getString(R.string.categoryFood));
        adapter.addFragment(new CinemasFragment(), getString(R.string.categoryCinema));
        adapter.addFragment(new MuseumsFragment(), getString(R.string.categoryMuseum));
        adapter.addFragment(new EventsFragment(), getString(R.string.categoryEvent));
        viewPager.setAdapter(adapter);

    }

    public void populatePlacesLibrary() {
        new Place(getString(R.string.categoryFood), getString(R.string.jeffsName), getString(R.string.jeffsAddress),
                getString(R.string.jeffsContact), R.drawable.jeffs);
        new Place(getString(R.string.categoryFood), getString(R.string.berekName), getString(R.string.berekAddress),
                getString(R.string.berekContact), R.drawable.berek);
        new Place(getString(R.string.categoryFood), getString(R.string.amritName), getString(R.string.amritAddress),
                getString(R.string.amritContact), R.drawable.amrit);
        new Place(getString(R.string.categoryFood), getString(R.string.dostacosName), getString(R.string.dostacosAddress),
                getString(R.string.dostacosContact), R.drawable.dostacos);
        new Place(getString(R.string.categoryFood), getString(R.string.thecoolcatName), getString(R.string.thecoolcatAddress),
                getString(R.string.thecoolcatContact), R.drawable.thecoolcat);

        new Place(getString(R.string.categoryCinema), getString(R.string.atlanticName), getString(R.string.atlanticAddress),
                getString(R.string.atlanticContact), R.drawable.atlantic);
        new Place(getString(R.string.categoryCinema), getString(R.string.multikinoName), getString(R.string.multikinoAddress),
                getString(R.string.multikinoContact), R.drawable.multikino);
        new Place(getString(R.string.categoryCinema), getString(R.string.cinemacityName), getString(R.string.cinemacityAddress),
                getString(R.string.cinemacityContact), R.drawable.cinemacity);
        new Place(getString(R.string.categoryCinema), getString(R.string.kinoprahaName), getString(R.string.kinoprahaAddress),
                getString(R.string.kinoprahaContact), R.drawable.kinopraha);
        new Place(getString(R.string.categoryCinema), getString(R.string.kinokulturaName), getString(R.string.kinokulturaAddress),
                getString(R.string.kinokulturaContact), R.drawable.kinokultura);


        new Place(getString(R.string.categoryMuseum), getString(R.string.zachetaName), getString(R.string.zachetaAddress),
                getString(R.string.zachetaContact), R.drawable.zacheta);
        new Place(getString(R.string.categoryMuseum), getString(R.string.narodoweName), getString(R.string.narodoweAddress),
                getString(R.string.narodoweContact), R.drawable.muzeumnarodowe);
        new Place(getString(R.string.categoryMuseum), getString(R.string.pwName), getString(R.string.pwAddress),
                getString(R.string.pwContact), R.drawable.muzeumpw);
        new Place(getString(R.string.categoryMuseum), getString(R.string.zamekkrolewskiName), getString(R.string.zamekkrolewskiAddress),
                getString(R.string.zamekkrolewskiContact), R.drawable.zamekkrolewski);
        new Place(getString(R.string.categoryMuseum), getString(R.string.mtName), getString(R.string.mtAddress),
                getString(R.string.mtContact), R.drawable.muzeumtechniki);

        new Place(getString(R.string.categoryEvent), getString(R.string.niepodleglosciName), getString(R.string.niepodleglosciAddress),
                getString(R.string.niepodleglosciContact), R.drawable.biegniepodleglosci);
        new Place(getString(R.string.categoryEvent), getString(R.string.konstytucjiName), getString(R.string.konstytucjiAddress),
                getString(R.string.konstytucjiContact), R.drawable.biegkonstytucji);
        new Place(getString(R.string.categoryEvent), getString(R.string.biegpwName), getString(R.string.biegpwAddress),
                getString(R.string.biegpwContact), R.drawable.biegpowstania);
        new Place(getString(R.string.categoryEvent), getString(R.string.orlenName), getString(R.string.orlenAddress),
                getString(R.string.orlenContact), R.drawable.orlenmarathon);
        new Place(getString(R.string.categoryEvent), getString(R.string.pzuName), getString(R.string.pzuAddress),
                getString(R.string.pzuContact), R.drawable.pzupolmaraton);
    }
}


