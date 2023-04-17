package com.example.second.ui.SanPham;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.second.databinding.FragmentSanPhamBinding;

public class FragmentSanPham extends Fragment {

private FragmentSanPhamBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        SanPhamViewModel galleryViewModel =
                new ViewModelProvider(this).get(SanPhamViewModel.class);

    binding = FragmentSanPhamBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textSanPham;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}