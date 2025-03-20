package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPeople {
    

    private List<People> listPeoples;

    public ListPeople() {
        this.listPeoples = new ArrayList<>();
    }

    public void addPeople(String name, int age, double height) {
        listPeoples.add(new People(name, age, height));
    }

    public List<People> orderAsc() {
        List<People> listP = new ArrayList<>(listPeoples);
        Collections.sort(listP);
        return listP;
    }

    public List<People> orderHeight() {
        List<People> listP = new ArrayList<>(listPeoples);
        Collections.sort(listP, new ComparatorForHeight());
        return listP;
    }
}
