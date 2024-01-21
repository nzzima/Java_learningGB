package sem6;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat(String color, int age, String name) {
        this.color = color;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age,color);
    }
}