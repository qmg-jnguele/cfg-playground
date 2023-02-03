package cfg.playground;

import java.util.*;

public class Exercise {
    public Collection<Integer> transform(Collection<Integer> elements) {
        var result = new ArrayList<Integer>();
        result.addAll(elementsInReverseOrder(elements));
        result.addAll(elementsInDescendingOrder(elements));
        return result;
    }

    public Collection<Integer> elementsInReverseOrder(Collection<Integer> elements) {
        throw new UnsupportedOperationException();
    }

    private Collection<Integer> elementsInDescendingOrder(Collection<Integer> elements) {
        throw new UnsupportedOperationException();
    }
}
