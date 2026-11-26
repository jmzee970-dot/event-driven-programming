# Activity 2: Build the Event Loop - Reflection

**Round 3 questions**
1. While the slow handler ran, all other events simply waited in the queue; none were lost, none were processed.
2. In a real application the window would freeze: buttons stop responding, the window will not repaint, and the OS may mark it "Not Responding".
3. Fix: keep handlers short and move slow work (network, file, database, long loops) to a background thread, then post only the result back to the event thread.

**Reflection**
The event queue is a first-in, first-out line that holds events (clicks, key presses, timers) until the program can handle them. The event loop is the endless cycle that takes the next event off the queue, dispatches it to the matching handler, and then repeats. Because the loop processes one event at a time, a slow handler delays every event behind it. That is why the event loop must never be blocked: the user interface depends on it to respond to input and repaint. Short handlers plus background threads keep the application responsive.
