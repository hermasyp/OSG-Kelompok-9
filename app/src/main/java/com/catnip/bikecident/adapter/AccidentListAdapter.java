package com.catnip.bikecident.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.catnip.bikecident.R;
import com.catnip.bikecident.databinding.ItemRowBinding;
import com.catnip.bikecident.model.accident.IncidentDetail;

import java.util.List;

public class AccidentListAdapter extends RecyclerView.Adapter<AccidentListAdapter.AccidentHolder> {
    private List<IncidentDetail> listIncident;
    private LayoutInflater layoutInflater;

    public AccidentListAdapter(List<IncidentDetail> listIncident) {
        this.listIncident = listIncident;
    }

    @NonNull
    @Override
    public AccidentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        ItemRowBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_row, viewGroup, false);
        return new AccidentHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AccidentHolder accidentHolder, int i) {
        accidentHolder.binding.setAccidentDetailVM(listIncident.get(i));
    }

    @Override
    public int getItemCount() {
        return listIncident.size();
    }

    class AccidentHolder extends RecyclerView.ViewHolder {

        private final ItemRowBinding binding;

        AccidentHolder(ItemRowBinding itemRowBinding) {
            super(itemRowBinding.getRoot());
            this.binding = itemRowBinding;
        }
    }
}
