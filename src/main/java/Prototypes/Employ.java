package Prototypes;

import java.util.ArrayList;
import java.util.List;

public class Employ implements  Cloneable {
    private List<String> list;

    public Employ() {
       list=new ArrayList<String>();
    }

    public Employ(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void  load(){
        list.add("Petrov");
        list.add("Smirnov");
        list.add("Ivanova");
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        List <String> clone=new ArrayList();
        for(String s:this.getList()){
            clone.add(s);
        }
       // return new Employ(clone);
        return super.clone();
    }


}
