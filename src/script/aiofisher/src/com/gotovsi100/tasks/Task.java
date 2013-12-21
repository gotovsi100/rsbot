package script.aiofisher.src.com.gotovsi100.tasks;


import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.methods.MethodProvider;


public abstract class Task extends MethodProvider {
    public Task(MethodContext ctx) {
        super(ctx);
    }

    /* override this to extend the sleep time */
    public int delay() {
        return 250;
    }

    /* returns the priority of the job. higher priority = executed first */
    public int priority() {
        return 0;
    }

    public abstract boolean activate();

    public abstract void execute();
}