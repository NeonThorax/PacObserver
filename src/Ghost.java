class Ghost implements Enemy {
    @Override
    public void update(Edible edible) {
        // Handle the update logic when an edible item changes state
        System.out.println("Ghost notified of state change in " + edible.getClass().getSimpleName());
    }
}