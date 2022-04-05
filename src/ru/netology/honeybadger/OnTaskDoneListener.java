package ru.netology.honeybadger;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
