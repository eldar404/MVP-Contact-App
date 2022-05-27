package io.portfolio.mvp.presentation.ui.fragment.credit;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import dagger.hilt.android.AndroidEntryPoint;
import io.portfolio.mvp.databinding.FragmentCreateBinding;
import io.portfolio.mvp.presentation.base.BaseFragment;
import io.portfolio.mvp.presentation.ui.fragment.details.DetailsViewModel;
import io.portfolio.mvp.presentation.ui.fragment.list.ListViewFragmentState;

@AndroidEntryPoint
public class CreateFragment extends BaseFragment<FragmentCreateBinding> {

    private CreateViewModel viewModel;

    @Override
    public void setupViewModel() {
        viewModel = new ViewModelProvider(this).get(CreateViewModel.class);
    }


    @Override
    public void setupUI() {

    }

    @Override
    public void setupObserver() {
        viewModel.state.observe(getViewLifecycleOwner(), state -> {
            if (state instanceof CreateViewFragmentState.IsLoading) {
                CreateViewFragmentState.IsLoading data = (CreateViewFragmentState.IsLoading) state;

            }

            if (state instanceof CreateViewFragmentState.ShowToast) {
                CreateViewFragmentState.ShowToast data = (CreateViewFragmentState.ShowToast) state;

            }
        });
    }

    @Override
    public FragmentCreateBinding bind() {
        return FragmentCreateBinding.inflate(getLayoutInflater());
    }
}