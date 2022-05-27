package io.portfolio.mvp.presentation.ui.fragment.list;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import dagger.hilt.android.AndroidEntryPoint;
import io.portfolio.mvp.databinding.FragmentListBinding;
import io.portfolio.mvp.presentation.base.BaseFragment;

@AndroidEntryPoint
public class ListFragment extends BaseFragment<FragmentListBinding> {

    private ListViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(this).get(ListViewModel.class);
    }

    @Override
    public void setupViewModel() {

    }

    @Override
    public void setupUI() {
        viewModel.getData();
    }

    @Override
    public void setupObserver() {
        viewModel.state.observe(getViewLifecycleOwner(), state -> {
            if (state instanceof ListViewFragmentState.IsLoading) {
                ListViewFragmentState.IsLoading data = (ListViewFragmentState.IsLoading) state;
            }

            if (state instanceof ListViewFragmentState.ShowToast) {
                ListViewFragmentState.ShowToast data = (ListViewFragmentState.ShowToast) state;
            }
        });
    }

    @Override
    public FragmentListBinding bind() {
        return FragmentListBinding.inflate(getLayoutInflater());
    }
}
