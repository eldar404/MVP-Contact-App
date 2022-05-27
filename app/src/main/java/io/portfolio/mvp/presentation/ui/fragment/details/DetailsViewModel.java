package io.portfolio.mvp.presentation.ui.fragment.details;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class DetailsViewModel extends ViewModel {

    public MutableLiveData<DetailsViewFragmentState> state = new MutableLiveData();

    private void showToast(String message) {
        state.postValue(new DetailsViewFragmentState.ShowToast(message));
    }

    private void hideLoading() {
        state.postValue(new DetailsViewFragmentState.IsLoading(false));
    }

    private void setLoading() {
        state.postValue(new DetailsViewFragmentState.IsLoading(true));
    }
}
