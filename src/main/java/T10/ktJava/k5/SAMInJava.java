package T10.ktJava.k5;

import java.util.ArrayList;

/**
 * Created by apple on 17/4/21.
 */
public class SAMInJava {

    private ArrayList<Runnable> runnables = new ArrayList<Runnable>();

    public void addTask(Runnable runnable){
        runnables.add(runnable);
        System.out.println("After add: " + runnable + ", we have " + runnables.size() + " in all.");
    }

    public void removeTask(Runnable runnable){
        runnables.remove(runnable);
        System.out.println("After remove: " + runnable + ", only " + runnables.size() + " left.");
    }

}