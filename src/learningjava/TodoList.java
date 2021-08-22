package learningjava;

import java.util.ArrayList;
import java.util.List;


public class TodoList implements InterfaceTodoList {
    List<String> list = new ArrayList();

    @Override
    public void add(String task) {
        list.add(task);
    }

    @Override
    public void print() {
        for (int i=0; i<list.size(); i++)  {
        System.out.println(i + ":" + list.get(i));
        }
    }

    @Override
    public void remove(int index) {
        if(index>=0 && index<list.size()) {
            list.remove(index);
        }
    }
}
