package com.catnip.bikecident.view.accidentlist;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.catnip.bikecident.Injection;
import com.catnip.bikecident.R;
import com.catnip.bikecident.adapter.AccidentListAdapter;
import com.catnip.bikecident.databinding.FragmentAccidentListBinding;
import com.catnip.bikecident.model.accident.IncidentDetail;
import com.catnip.bikecident.navigator.IncidentNavigator;
import com.catnip.bikecident.viewmodel.IncidentViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccidentListFrag extends Fragment {

    private IncidentViewModel mIncidentViewModel;
    private RecyclerView recIncident;

    private AccidentListAdapter adapter;
    private List<IncidentDetail> dataListIncident;
    private FragmentAccidentListBinding binding;


    public AccidentListFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_accident_list, container, false);
        View view = binding.getRoot();

        IncidentNavigator incidentNavigator = new IncidentNavigator() {
            @Override
            public void loadListIncident(List<IncidentDetail> listIncident) {
                dataListIncident.addAll(listIncident);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void errorLoadListIncident(String message) {
                Log.e("ERROR", message);
            }
        };

        mIncidentViewModel = new IncidentViewModel(Injection.provideIncidentRepository(getContext()), getContext());
        dataListIncident = new ArrayList<>();
        mIncidentViewModel.setNavigator(incidentNavigator);
        mIncidentViewModel.getListIncident();

        binding.setVm(mIncidentViewModel);
        initAdapter();

        return view;
    }

    private void initAdapter() {
        adapter = new AccidentListAdapter(dataListIncident);
        recIncident = binding.recyclerIncident;
        recIncident.setLayoutManager(new LinearLayoutManager(getContext()));
        recIncident.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recIncident.setAdapter(adapter);
    }
}
