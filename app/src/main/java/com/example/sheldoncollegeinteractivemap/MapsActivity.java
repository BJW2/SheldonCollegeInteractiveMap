package com.example.sheldoncollegeinteractivemap;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.example.sheldoncollegeinteractivemap.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //change the layout of the map
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);


        // Add a marker for the LINQBuilding
        LatLng LINQBuilding = new LatLng(-27.568625, 153.233705);
        Marker LINQ_Building = mMap.addMarker(new MarkerOptions().position(LINQBuilding).title("LINQ Building"));
        // Add a marker for the SIBlock
        LatLng SIblock = new LatLng(-27.569534, 153.23318);
        Marker SI_Block = mMap.addMarker(new MarkerOptions().position(SIblock).title("SI Block"));

        // Add a marker for the SCBlock
        LatLng SCblock = new LatLng(-27.569145, 153.233383);
        Marker SC_Block = mMap.addMarker(new MarkerOptions().position(SCblock).title("SC Block"));

        // Add a marker for the SABlock
        LatLng SAblock = new LatLng(-27.569387, 153.234263);
        Marker SA_Block = mMap.addMarker(new MarkerOptions().position(SAblock).title("SA Block"));

        // Add a marker for the Stadium
        LatLng Stadium = new LatLng(-27.569477, 153.232579);
        Marker Stadium_ = mMap.addMarker(new MarkerOptions().position(Stadium).title("Stadium"));

        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(@NonNull Marker marker) {
                if (marker.equals(LINQ_Building)){ //If the marker is LINQBuilding run this method
                    startActivity(new Intent(MapsActivity.this,LINQBuildingTeachers.class)); //Starts the activity for LINQBuildingTeachers
                }

                if (marker.equals(SI_Block)){ //If the marker is SIBlock run this method
                    startActivity(new Intent(MapsActivity.this,LINQBuildingTeachers.class)); //Starts the activity for LINQBuildingTeachers
                }

                if (marker.equals(SC_Block)){ //If the marker is SCBlock run this method
                    startActivity(new Intent(MapsActivity.this,LINQBuildingTeachers.class)); //Starts the activity for LINQBuildingTeachers
                }

                if (marker.equals(SA_Block)){ //If the marker is SABlock run this method
                    startActivity(new Intent(MapsActivity.this,LINQBuildingTeachers.class)); //Starts the activity for LINQBuildingTeachers
                }

                if (marker.equals(Stadium_)){ ////If the marker is Stadium run this method
                    startActivity(new Intent(MapsActivity.this,LINQBuildingTeachers.class)); //Starts the activity for LINQBuildingTeachers
                }
            }
        });

        //move map view to camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LINQBuilding)); //Moves the camera to the Marker LINQBuilding
        mMap.setMinZoomPreference(17); //Sets the Zoom for the camera to be 17

    }

}