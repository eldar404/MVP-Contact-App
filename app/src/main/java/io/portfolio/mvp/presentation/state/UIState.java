package io.portfolio.mvp.presentation.state;

public class UIState<T> {
    public static class Loading<T> extends UIState<T> {
        public boolean status;

        public Loading(boolean status) {
            status = status;
        }
    }

    public static class Error<T> extends UIState<T> {
        public String error;

        public Error(String error) {
            error = error;
        }
    }

    public static class Success<T> extends UIState<T> {
        public T data;

        public Success(T data) {
            data = data;
        }
    }
}
