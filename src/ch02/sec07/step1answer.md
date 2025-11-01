Simply declare

    private record Item(String description, int quantity, double unitPrice) {
        double price() { return quantity * unitPrice; }
        public String toString() { 
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }        
    }
    
A nested record is automatically static.

Change the body of the `addItem` method to:

    items.add(new Item(description, quantity, unitPrice);
