package br.edu.zonasul.ifpi.stransthe;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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

    private void addVeiculo(String title, LatLng veiculo, int resource){

        mMap.addMarker(
                new MarkerOptions()
                .position(veiculo)
                .title(title)
                .icon(BitmapDescriptorFactory.fromResource(resource))
        );

        mMap.setOnMarkerClickListener(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng veiculo = new LatLng(-5.14842000, -42.79380000);
        addVeiculo("4663",veiculo,R.drawable.feliz);

        veiculo = new LatLng(-5.08364000, -42.78894000);
        addVeiculo("4733",veiculo,R.drawable.triste);

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(veiculo, 12.0f));

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        startActivity(new Intent(MapsActivity.this, Avaliacao.class));
        return false;
    }
}
