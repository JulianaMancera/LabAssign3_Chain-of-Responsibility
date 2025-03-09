// Concrete collector for Organic Waste
public class OrganicWasteCollector extends WasteCollector {
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Organic")) {
            System.out.println("Organic waste collected and composted.");
        } else {
            super.collectWaste(container);
        }
    }
}