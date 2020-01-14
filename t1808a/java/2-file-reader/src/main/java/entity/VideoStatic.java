package entity;

public class VideoStatic {
    private String id;
    private String name;
    private int viewStatic;

    public VideoStatic() {
    }

    public VideoStatic(String id, String name, int viewStatic) {
        this.id = id;
        this.name = name;
        this.viewStatic = viewStatic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViewStatic() {
        return viewStatic;
    }

    public void setViewStatic(int viewStatic) {
        this.viewStatic = viewStatic;
    }
}
