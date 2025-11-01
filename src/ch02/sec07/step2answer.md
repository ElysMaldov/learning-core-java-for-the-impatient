Every inner class `Member` object has a reference to an outer class `Network` object. That reference is created when the inner class object is constructed. 

The syntax `myFace.new Member("Wilma")` says: When constructing the member with name Wilma, set the enclosing Network instance to `myFace`.

The methods of the inner class can access any fields or methods of the enclosing instance. But if they need to refer to the enclosing instance in its entirety, the notation `Network.this` is used. 

If you like, you can be explicit about the two levels of `this`. For example, the `deactivate` method can be written as:

    public void deactivate() {
        Network.this.members.remove(this);
    }

