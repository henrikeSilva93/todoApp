package todo;

public class Todo {
    private long id;
    private String todo;
    private Boolean done = false;

    public Todo(long id, String todo, Boolean done) {
        this.id = id;
        this.todo = todo;
        this.done = done;
    }
    public Todo(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
    public String imprimirTodo(){

        return " id: " + this.id + " todo: "
                + this.todo + " Concluído? " + this.done;
    }
}
