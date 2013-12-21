package script.aiofisher.src.com.gotovsi100.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
* Author: Aadil Farouk
* Date: 6/17/13
* Time: 3:59 PM
*/

public class TaskContainer implements Comparator<Task> {
    private List<Task> tasklist = new ArrayList<Task>();

    public TaskContainer(Task... tasks) {
        submit(tasks);
    }

    public void submit(final Task... tasks) {
        for (Task j : tasks) {
            if (!tasklist.contains(j)) {
            	tasklist.add(j);
            }
        }
        Collections.sort(tasklist, this);
    }

    @Override
    public int compare(Task o1, Task o2) {
        return o2.priority() - o1.priority();
    }

    public void revoke(Task j) {
        if (tasklist.contains(j)) {
        	tasklist.remove(j);
        }
    }

    public void clear() {
    	tasklist.clear();
    }

    public Task get() {
        for (Task j : tasklist) {
            if (j.activate()) {
                return j;
            }
        }
        return null;
    }
}
