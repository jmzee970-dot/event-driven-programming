# Activity 1: Spot the Components

| # | System | Event Source | Event | Listener | Handler / Action |
|---|--------|--------------|-------|----------|------------------|
| 1 | ATM | Keypad button | Button pressed | ATM software | Verify PIN |
| 2 | ATM | Card slot | Card inserted | Card reader | Read card data |
| 3 | ATM | Cash dispenser | Cash taken | Sensor | End transaction |
| 4 | Microwave oven | Start button | Button pressed | Control board | Start heating and countdown timer |
| 5 | Microwave oven | Door switch | Door opened | Safety interlock | Stop magnetron, pause timer |
| 6 | Traffic light | Timer | Interval elapsed | Light controller | Switch to the next light phase |
| 7 | Traffic light | Pedestrian button | Button pressed | Light controller | Queue a pedestrian crossing phase |
| 8 | Video game | Gamepad / touchscreen | Button pressed | Game loop input system | Move or jump the character |
| 9 | Video game | Collision detector | Player touches enemy | Game engine | Reduce health, play sound |
| 10 | Elevator | Floor button | Button pressed | Elevator controller | Add floor to request queue |
| 11 | Elevator | Door sensor | Beam blocked | Door controller | Reopen doors |
| 12 | Smartphone | Touchscreen | Tap | OS touch handler | Open the tapped app |
| 13 | Online shop | "Add to cart" button | Click | JavaScript listener | Add item, update cart count |
| 14 | Self-checkout | Barcode scanner | Item scanned | POS software | Add item and price to the bill |

## Self-check
1. **Source vs listener:** the source *generates* events (e.g. a button); the listener *waits for and receives* them (e.g. an ActionListener registered on that button).
2. **One source, many listeners:** yes. A "Save" button can notify a logger, a status label and an autosave timer at once.
3. **One listener, many sources:** yes. One ActionListener can serve every number button of a calculator and check `e.getSource()` to tell them apart.
