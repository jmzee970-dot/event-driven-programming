# Limitations of java.util.Observer / Observable

1. **Single inheritance:** Observable is a class, so the subject must extend it and cannot extend anything else.
2. **setChanged() trap:** forgetting `setChanged()` before `notifyObservers()` silently skips all observers.
3. **Pull model only:** observers get the Observable and must call getters, which means more code and more coupling.
4. **Unspecified order:** observers may be notified in any order.
5. **Not thread-safe:** concurrent changes can cause ConcurrentModificationException.
6. **Deprecated since Java 9** because of the flaws above.
