    public void addFriend(Member newFriend) {
        if (newFriend.belongsTo(Network.this))
            friends.add(newFriend);
    }
