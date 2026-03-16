package Hashmap;

import java.util.Objects;
;
class hashmap {

    String id;
    String name;

    hashmap(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        hashmap h = (hashmap) obj;

        return id.equals(h.id) && name.equals(h.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    public static void main(String[] args) {

        hashmap s1 = new hashmap("101", "Karthicc");
        hashmap s2 = new hashmap("101", "Karthicc");

        System.out.println("Equal:" + s1.equals(s2));
        System.out.println("s1" + s1.hashCode());
        System.out.println("s2 " + s2.hashCode());
    }
}