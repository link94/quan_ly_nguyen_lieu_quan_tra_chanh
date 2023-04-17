package com.example.second.ui.Menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.second.databinding.FragmentMenuBinding;

public class FragmentMenu extends Fragment {

private FragmentMenuBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        MenuViewModel slideshowViewModel =
                new ViewModelProvider(this).get(MenuViewModel.class);

    binding = FragmentMenuBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textMenu;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}