package com.daniel.jdcg_eva02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: AppCompatActivity
    private lateinit var googleMap : GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val fragmentMap = supportFragmentManager.findFragmentById(R.id.fcv_map) as SupportMapFragment
        fragmentMap.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        val hotel = LatLng(-11.694725173599986, -76.84606532749817 )
        val plaza = LatLng(-12.005786315553854, -77.0597518033384)
        val museo = LatLng(-12.06790457014587, -77.06713321518274)
        googleMap.addMarker(MarkerOptions().position(hotel).title("hotel"))
        googleMap.addMarker(MarkerOptions().position(plaza).title("Plaza norte"))
        googleMap.addMarker(MarkerOptions().position(museo).title("museo"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(hotel))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(plaza))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(museo))

    }
}