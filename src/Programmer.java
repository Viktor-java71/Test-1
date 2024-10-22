import java.util.ArrayList;
import java.util.List;

public class Programmer {

    private String name;
    private List<Task> tasks;
    private List<String> technologies;

    public Programmer(String name, List<String> technologies) {
        this.name = name;
        this.technologies = technologies;
        tasks = new ArrayList<>();
    }
    @Override
    public String toString(){
        return name +" " +technologies + "tasks" + tasks;
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    public List<Task> getTasks(){
        return tasks;
    }
    public boolean checkTaskByNumber(int number){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getNumber()==number){
                return true;
            }

        }
        return  false;
    }

}
