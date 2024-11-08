import java.util.Vector;

public class TaskManager {
    private Vector<Task> tasks = new Vector<Task>();

    public TaskManager(){
        tasks = new Vector<Task>();
    }

    public void createTask(String taskName, String description){
        if(taskName == null || description == null){
            throw new IllegalArgumentException("Task name and description cannot be null");
        }else{
            Task task = new Task(taskName, description);
            tasks.add(task);
        }
    }

    public void completeTask(String taskName){
        for(Task task : tasks){
            if(task.getTaskName().equals(taskName)){
                task.setComplete(true);
            }
        }
    }

    public boolean findTask(String taskName){
        for(Task task : tasks){
            if(task.getTaskName().equals(taskName)){
                return true;
            }
        }
        return false;
    }

    public boolean getTaskCompletition(String taskName){
        for(Task task : tasks){
            if(task.getTaskName().equals(taskName)){
                return task.isComplete();
            }
        }
        return false;
    }

    public void listAllTasks(){
        int cout = 0;
        for(Task task : tasks){
            cout++;
            System.out.println("Task " + cout);
            System.out.println(task.getTaskName());
            System.out.println(task.getDescription());
            System.out.println(task.isComplete());
        }
    }
}
