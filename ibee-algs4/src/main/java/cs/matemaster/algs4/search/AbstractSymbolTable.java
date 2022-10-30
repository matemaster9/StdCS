package cs.matemaster.algs4.search;

/**
 * @author matemaster
 */
public abstract class AbstractSymbolTable<K, V> implements SymbolTable<K, V> {

    @Override
    public abstract void put(K key, V value);

    @Override
    public abstract V get(K key);

    @Override
    public void delete(K key) {
        put(key, null);
    }

    @Override
    public boolean contains(K key) {
        return get(key) != null;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public abstract int size();

    @Override
    public abstract Iterable<K> keys();
}
