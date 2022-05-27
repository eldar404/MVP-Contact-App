package io.portfolio.mvp.presentation.ui.fragment.credit;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
class CreateViewModel extends ViewModel {

    public MutableLiveData<CreateViewFragmentState> state = new MutableLiveData();

    private void showToast(String message) {
        state.postValue(new CreateViewFragmentState.ShowToast(message));
    }

    private void hideLoading() {
        state.postValue(new CreateViewFragmentState.IsLoading(false));
    }

    private void setLoading() {
        state.postValue(new CreateViewFragmentState.IsLoading(true));
    }
}
