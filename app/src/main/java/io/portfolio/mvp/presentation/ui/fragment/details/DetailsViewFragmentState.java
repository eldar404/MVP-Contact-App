package io.portfolio.mvp.presentation.ui.fragment.details;

import io.portfolio.mvp.presentation.ui.fragment.list.ListViewFragmentState;

public class DetailsViewFragmentState {
    public static class IsLoading extends DetailsViewFragmentState {
        private boolean isLoading;

        public boolean getIsLoading() {
            return isLoading;
        }

        public IsLoading(boolean isLoading) {
            this.isLoading = isLoading;
        }
    }

    public static class ShowToast extends DetailsViewFragmentState {
        private String message;

        public String getMessage() {
            return message;
        }

        public ShowToast(String message) {
            this.message = message;
        }
    }
}
