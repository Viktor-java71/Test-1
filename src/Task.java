public class Task {
    private int number;
    private String title;
    private String descrition;

    public Task(int number, String title, String descrition) {
        this.number = number;
        this.title = title;
        this.descrition = descrition;
    }
    @Override
    public String toString(){
        return String.format("%02d.%s [%s]",number,title, descrition);
    }
    public int getNumber(){
        return number;
    }


}
