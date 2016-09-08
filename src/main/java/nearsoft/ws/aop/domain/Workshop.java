package nearsoft.ws.aop.domain;

public class Workshop {

    private boolean active;
    private String name;
    private String presenter;


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "active=" + active +
                ", name='" + name + '\'' +
                ", presenter='" + presenter + '\'' +
                '}';
    }
}
