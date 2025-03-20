package list;

import java.util.ArrayList;
import java.util.List;

import model.Task;

public class ListTask {
    

    private List<Task> listTask;

    public ListTask() {
        this.listTask = new ArrayList<>();
    }


    public void addTask(String descricao) {
        listTask.add(new Task(descricao));
    }

    public void removeTask(String descricao) {
        List<Task> listTaskRemove = new  ArrayList<>();
        for(Task t : listTask) {
            if(t.getDescription().equalsIgnoreCase(descricao)) {
                listTaskRemove.add(t);
            }
        }

        listTask.removeAll(listTaskRemove);
    }

    public int countTasks() {
        return listTask.size();
    }

    public List<String> getAllDescriptions() {
        List<String> listDescription = new ArrayList<>();
        for (Task t : listTask) {
            listDescription.add(t.getDescription());
        }
        return listDescription;
    }
}
