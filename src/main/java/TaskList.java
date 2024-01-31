import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> taskList;

    TaskList() {
        this.taskList = new ArrayList<Task>();
    }

    public void addTask(Task t) {
        this.taskList.add(t);
    }

    public Task getTask(int i) {
        return this.taskList.get(i);
    }

    public int getCount() {
        return this.taskList.size();
    }

    public void deleteTask(int i) {
        this.taskList.remove(i);
    }

    public String getFileRepresentation() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < this.taskList.size(); i++) {
            output.append(this.taskList.get(i).toFileString());
            if (i < this.taskList.size() - 1) output.append("\n");
        }
        return output.toString();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < this.taskList.size(); i++) {
            output.append(String.format("%d. %s", i + 1, this.taskList.get(i)));
            if (i < this.taskList.size() - 1) output.append("\n");
        }
        return output.toString();
    }
}
