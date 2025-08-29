package fawry.task.demo.models;

import java.util.UUID;

public final class Employee {

    private UUID id;
    private String name;
    private String position;

    public Employee() {
    }

    public Employee(String name, String position) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.position = position;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("{id=%s, name='%s', position='%s'}", id, name, position);
    }

}
