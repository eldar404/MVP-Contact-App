package io.portfolio.mvp.presentation.ui.fragment.details;

import androidx.lifecycle.ViewModelProvider;

import dagger.hilt.android.AndroidEntryPoint;
import io.portfolio.mvp.databinding.FragmentDetailsBinding;
import io.portfolio.mvp.presentation.base.BaseFragment;
import io.portfolio.mvp.presentation.ui.fragment.list.ListViewModel;

@AndroidEntryPoint
public class DetailsFragment extends BaseFragment<FragmentDetailsBinding> {

    private DetailsViewModel viewModel;

    @Override
    public void setupViewModel() {
        viewModel = new ViewModelProvider(this).get(DetailsViewModel.class);
    }

    @Override
    public void setupUI() {

    }

    @Override
    public void setupObserver() {
        viewModel.state.observe(getViewLifecycleOwner(), state -> {
            if (state instanceof DetailsViewFragmentState.IsLoading) {
                DetailsViewFragmentState.IsLoading data = (DetailsViewFragmentState.IsLoading) state;
            }

            if (state instanceof DetailsViewFragmentState.ShowToast) {
                DetailsViewFragmentState.ShowToast data = (DetailsViewFragmentState.ShowToast) state;
            }
        });
    }

    @Override
    public FragmentDetailsBinding bind() {
        return FragmentDetailsBinding.inflate(getLayoutInflater());
    }
}