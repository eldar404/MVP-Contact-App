package io.portfolio.mvp.presentation.ui.fragment.credit;

public class CreateViewFragmentState {

    public static class IsLoading extends CreateViewFragmentState {
        private boolean isLoading;

        public boolean getIsLoading() {
            return isLoading;
        }

        public IsLoading(boolean isLoading) {
            this.isLoading = isLoading;
        }
    }

    public static class ShowToast extends CreateViewFragmentState {
        private String message;

        public String getMessage() {
            return message;
        }

        public ShowToast(String message) {
            this.message = message;
        }
    }
}