package entity;

import org.jetbrains.annotations.NotNull;

public record TestEntity(String name, int age) implements Comparable<TestEntity> {

    @Override
    public int compareTo(@NotNull TestEntity entity) {
        int result = 1;
        if (this.equals(entity)) {
            result = 0;
        } else if (this.age < entity.age()) {
            result = -1;
        } else if(this.age == entity.age()) {
            result = 0;
        }

        return result;
    }

    @Override
    public String toString() {
        return "TestEntity: " +
                "\tName - " + name +
                "\tAge - " + age;
    }
}
