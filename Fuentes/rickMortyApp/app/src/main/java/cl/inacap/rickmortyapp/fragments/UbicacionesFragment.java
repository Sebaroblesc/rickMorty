package cl.inacap.rickmortyapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.inacap.rickmortyapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UbicacionesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UbicacionesFragment extends Fragment {


    public UbicacionesFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ubicaciones, container, false);
    }
}