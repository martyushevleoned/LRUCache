import java.util.ArrayList;
import java.util.List;

public class LRUCache<T> {

    private final int size;
    private final ArrayList<T> elements;

    public LRUCache(int size) {
        this.size = size;
        elements = new ArrayList<T>();
    }

    public void addElement(T element) {

        if (elements.contains(element)) {
            elements.remove(element);
            elements.add(element);
            return;
        }

        if (elements.size() >= size)
            elements.subList(0, elements.size() - size + 1).clear();
        elements.add(element);
    }

    public T getElement(int i) {
        if (0 <= i && i < size)
            return elements.get(i);
        return null;
    }

    public List<T> getAllElements() {
        return elements;
    }
}
