import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList1 = new ArrayList<>();// Создаем пустой лист для Task
        taskList1.add(new Task(1,"задача №1","Реализовать задачу #1")); // добавляем задачу в лист
        taskList1.add(new Task(2,"задача №2","Реализовать задачу #2"));
        taskList1.add(new Task(3,"задача №3","Реализовать задачу #3"));

        List<Task> taskListe2 = List.of ( // Создаем лист таск сразу с данными
                new Task(4,"задача №4","Реализовать задачу 4"),
                new Task(5,"задача №5","Реализовать задачу 5"),
                new Task(6,"задача №6","Реализовать задачу 6"),
                new Task(7,"задача №7","Реализовать задачу 7")
        );

        List<String> technologis1 = List.of("java","go","mysql");
        List<String> technologis2 = List.of("java","c++","mysql","go");

        List<Programmer> programmers = List.of(
                new Programmer("Jack",technologis1),
                new Programmer("Lena",technologis2),
                new Programmer("Nick",List.of("java","go","mysql"))
        );
        for (int i = 0; i < programmers.size(); i++) {
            System.out.println(programmers.get(i));

        }
        System.out.println("......................добавили всем задачам номер 1");
        for (int i = 0; i < programmers.size(); i++) {
            programmers.get(i).addTask(taskList1.get(0));

        }
        for (int i = 0; i < programmers.size(); i++) {
            System.out.println(programmers.get(i));

        }
        System.out.println("-------------------добавили Дене задачу 2");
        programmers.get(1).addTask(taskList1.get(1));

        for (int i = 0; i < programmers.size(); i++) {
            System.out.println(programmers.get(i));

        }
        System.out.println("усть ли у Лены task №2");
        System.out.println(programmers.get(1).checkTaskByNumber(2));
        System.out.println("есть ли у Джек таск нормер 2");
        System.out.println(programmers.get(0).checkTaskByNumber(2));

    }
}