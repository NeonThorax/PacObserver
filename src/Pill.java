import java.util.ArrayList;
import java.util.List;

class Pill implements Edible {
    private List<Enemy> enemyList = new ArrayList<>();
    private Object state;

    @Override
    public void register(Enemy enemy) {
        enemyList.add(enemy);
    }

    @Override
    public void unregister(Enemy enemy) {
        enemyList.remove(enemy);
    }

    @Override
    public void notifyEnemies() {
        for (Enemy enemy : enemyList) {
            enemy.update(this);
        }
    }

    @Override
    public Object getState() {
        return state;
    }

    @Override
    public void setState(Object state) {
        this.state = state;
        notifyEnemies();
    }
}