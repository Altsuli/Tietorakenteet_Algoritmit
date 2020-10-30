/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;

/**
 *
 * @author kamaj
 */
public class Stack {
    private ListItem mTop; // viite pinon huipulle
    private int mSize = 0; // pinottujen alkioiden lkm
    
    // luo uusi lista-alkio, vie se pinon huipulle
    public void push(String aData){
        ListItem newList = new ListItem();
        newList.setData(aData);
        newList.setNext(mTop);
        mTop = newList;
        mSize++;
    }
    
    // palauta pinon huipulla oleva alkio, jos pinossa ei ole
    // mitään palauta null
    public ListItem pop() {
        ListItem temp = mTop;
        mTop = mTop.getNext();
        mSize--;
        return temp;
    }
    
    // palauta pinottujen alkioiden lkm
    public int getSize() {
        return mSize;
    }
    
    // tulosta pinon sisältö muuttamatta pinoa
    public void printItems() {
        System.out.println("Tulosta pinon sis�lt�");
        ListItem current = mTop;
        while(current != null) {
        	System.out.println(current);
        	current = current.getNext();
        }
    }
    
}