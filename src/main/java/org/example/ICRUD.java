package org.example;

public interface ICRUD {
    public Object add();
    public int updateList(Object obj);
    public int deleteList(Object obj);
    public void selectWords(int id);

}
