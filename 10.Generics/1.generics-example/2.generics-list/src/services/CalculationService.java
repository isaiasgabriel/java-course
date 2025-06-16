package services;

import java.util.List;

public class CalculationService {

    // The type parameter <T> allows the interface to be used with any object type,
    // providing type safety and flexibility. Implementations of this interface can
    // store, retrieve, and manage elements of any specified type without needing to cast.

    // Simplified version:
    // public static TYPE max(TYPE list) {}
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}