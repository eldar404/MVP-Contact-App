package io.portfolio.mvp.presentation.ui.fragment.list;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.portfolio.mvp.domain.list.usecases.GetListUseCase;
import io.portfolio.mvp.presentation.ui.fragment.credit.CreateViewFragmentState;

@HiltViewModel
public class ListViewModel extends ViewModel {

    @Inject GetListUseCase getListUseCase;

    public MutableLiveData<ListViewFragmentState> state = new MutableLiveData();

    public void getData() {
        Log.d("test123321", "" + getListUseCase.toString());
    }

    private void showToast(String message) {
        state.postValue(new ListViewFragmentState.ShowToast(message));
    }

    private void hideLoading() {
        state.postValue(new ListViewFragmentState.IsLoading(false));
    }

    private void setLoading() {
        state.postValue(new ListViewFragmentState.IsLoading(true));
    }
}
