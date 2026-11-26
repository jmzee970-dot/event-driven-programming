# Comparison of Event Notification Mechanisms

| Mechanism | Push/Pull | Status | Best for |
|-----------|-----------|--------|----------|
| Custom Observer | Both | Recommended | Any Java project |
| java.util.Observer | Pull | Deprecated (Java 9) | Legacy code only |
| PropertyChangeListener | Push (old + new value) | Legacy but functional | JavaBeans, Swing |
| JavaFX Properties & Bindings | Push | Recommended | JavaFX applications |

| Feature | Custom | Legacy | PropertyChange | JavaFX |
|---------|--------|--------|----------------|--------|
| Type safety | Yes | No | No | Yes |
| Carries old value | Optional | No | Yes | Yes (ChangeListener) |
| Auto-manages listener list | No | Yes | Yes | Yes |
| Thread-safe | Depends | No | Yes (with care) | No (FX thread only) |
| Requires inheritance | No | Yes | No | No |
| Recommended today | Yes | No | Partly | Yes |
