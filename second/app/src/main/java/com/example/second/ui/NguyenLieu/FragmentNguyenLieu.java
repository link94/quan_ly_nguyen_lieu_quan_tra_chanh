package com.example.second.ui.NguyenLieu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.second.databinding.FragmentNguyenLieuBinding;

public class FragmentNguyenLieu extends Fragment {

private FragmentNguyenLieuBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        NguyenLieuViewModel homeViewModel =
                new ViewModelProvider(this).get(NguyenLieuViewModel.class);

    binding = FragmentNguyenLieuBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textNguyenLieu;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}