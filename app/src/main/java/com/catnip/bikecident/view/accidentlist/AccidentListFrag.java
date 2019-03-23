package com.catnip.bikecident.view.accidentlist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.catnip.bikecident.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccidentListFrag extends Fragment {


    public AccidentListFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accident_list, container, false);
    }

}
