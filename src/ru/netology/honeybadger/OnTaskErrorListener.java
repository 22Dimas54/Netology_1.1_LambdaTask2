package ru.netology.honeybadger;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
