# Decision Guide

- **Building a JavaFX UI?** Use JavaFX Properties and Bindings.
- **Swing or JavaBeans, need the old value in the event?** Use PropertyChangeListener.
- **Plain Java library or domain logic, custom event types?** Write a custom Observer (use CopyOnWriteArrayList if threads are involved).
- **Maintaining old code that uses java.util.Observable?** Keep it running, but plan to migrate.
- **Starting new code?** Never use java.util.Observable.
