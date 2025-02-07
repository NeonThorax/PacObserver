interface Edible {
    void register(Enemy enemy);
    void unregister(Enemy enemy);
    void notifyEnemies();
    Object getState();
    void setState(Object state);
}