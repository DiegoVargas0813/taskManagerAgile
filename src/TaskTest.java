import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.Vector;

public class TaskTest {
    @Test
    public void testCreateTask(){
        TaskManager taskManager = new TaskManager();
        taskManager.createTask("Task 1", "Description 1");
        assertTrue(taskManager.findTask("Task 1"));
    }

    @Test
    public void testCompleteTask(){
        TaskManager taskManager = new TaskManager();
        taskManager.createTask("Task 1", "Description 1");
        taskManager.completeTask("Task 1");
        assertTrue(taskManager.getTaskCompletition("Task 1"));
    }

    @Test
    public void testlistAll(){
        TaskManager taskManager = new TaskManager();
        taskManager.createTask("Task 1", "Description 1");
        taskManager.createTask("Task 2", "Description 2");
        taskManager.createTask("Task 3", "Description 3");
        taskManager.createTask("Task 4", "Description 4");
        taskManager.createTask("Task 5", "Description 5");
        taskManager.listAllTasks();
    }
}
