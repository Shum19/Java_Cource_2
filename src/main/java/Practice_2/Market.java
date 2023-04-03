package Practice_2;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> actors = new ArrayList<>();
    private Queue<Actor> actorQueue = new ArrayDeque<>();


//   MarketBehaviour
    @Override
    public void acceptToMarket(Actor actor) {
        this.actors.add(actor);
        System.out.println(actor.toString());
    }

    @Override
    public void releaseFromMarket(Actor actors) {
        this.actors.remove(actors);


    }

    @Override
    public void update() {
    }

// QueueBehaviour
    @Override
    public void takeInQueue(Actor actor) {
        this.actorQueue.add(actor);
        System.out.println(actorQueue.peek());

    }

    @Override
    public void takeOrders() {
        Actor actor = this.actorQueue.peek();
        if (actor instanceof Human){
            ((Human)actor).setMakeOrder();
        }
    }

    @Override
    public void giveOrders() {
        Actor actor = this.actorQueue.peek();
        if (actor instanceof Human) {
            ((Human) actor).setTakeOrder();
        }

    }
    @Override
    public void releaseFromQueue() {
        this.actorQueue.poll();
    }
    public String toString(){
        String data = actors.toString();
        return data;
    }

}
