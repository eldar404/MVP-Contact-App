package io.portfolio.mvp.presentation.ui.fragment.list;

import io.portfolio.mvp.presentation.ui.fragment.credit.CreateViewFragmentState;

public class ListViewFragmentState {

    public static class IsLoading extends ListViewFragmentState {
        private boolean isLoading;

        public boolean getIsLoading() {
            return isLoading;
        }

        public IsLoading(boolean isLoading) {
            this.isLoading = isLoading;
        }
    }

    public static class ShowToast extends ListViewFragmentState {
        private String message;

        public String getMessage() {
            return message;
        }

        public ShowToast(String message) {
            this.message = message;
        }
    }
}
