# RBCS 7312 - Event-Driven Programming (Java)

Weekly activities for Sep-Dec 2026.

**Author:** Julius Elivis Njoroge (Riara University)

| Folder | Topic |
|--------|-------|
| week01-event-driven-fundamentals | Event-driven basics: components, event loop, procedural vs event-driven, bug fixing, system design |
| week02* | Observer pattern: weather station, legacy Observable, refactoring, notification mechanisms |
| week02-observer-pattern | Observer pattern: weather station, legacy Observable, refactoring, notification mechanisms |
| week03-swing-gui | Swing GUI: JFrame, components, layout managers, the EDT rule, static mockup |
| week04-swing-event-handling | Swing event handling: listeners, item/document listeners, counter app, mouse and key |
| week05-advanced-swing | Advanced Swing: JList, JTable, JTree/tabs, menus and dialogs, file manager |
| week06-javafx-intro | JavaFX intro: Stage/Scene, layouts, FXML + controller, dashboard |
| week07-javafx-event-handling | JavaFX events: filters vs handlers, mouse/key, drag and drop, custom events |
| week08-properties-and-bindings | JavaFX properties and bindings: listeners, binding, reactive form |
| week09-async-javafx | Async JavaFX: freeze demo, Task, progress, Service |
| week10-final-project-university-system | Final project: University Management System (JavaFX + MySQL) |

## Running the code

**Weeks 1-5 (Swing, plain Java):**
```
cd week03-swing-gui/activity1-your-first-swing-window
javac FirstWindow.java
java FirstWindow
```
Folders with several files: `javac *.java`, then run the class that has `main`.

**Weeks 6-9 (JavaFX, Maven):** needs JDK 17+ and Maven.
```
cd week06-javafx-intro
mvn clean javafx:run
mvn clean javafx:run -Djavafx.mainClass=com.example.LayoutDemo   # run another class
```

**Week 10 (JavaFX + MySQL):**
1. Run `week10-final-project-university-system/database/schema.sql` in MySQL Workbench.
2. Set credentials in your shell (PowerShell example; do not commit them):
   ```
   $env:MYSQL_USER = "root"
   $env:MYSQL_PASSWORD = "your-local-mysql-password"
   ```
3. From `week10-final-project-university-system`, run `mvn clean javafx:run`.
