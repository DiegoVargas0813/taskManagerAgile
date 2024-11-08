public class Task {
    private String taskName;
    private String description;
    private boolean isComplete;

    public Task(String taskName, String description) {
        this.taskName = taskName;
        this.description = description;
        this.isComplete = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
