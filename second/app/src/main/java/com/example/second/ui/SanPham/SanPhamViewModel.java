package com.example.second.ui.SanPham;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SanPhamViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SanPhamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Sản Phẩm");
    }

    public LiveData<String> getText() {
        return mText;
    }
}