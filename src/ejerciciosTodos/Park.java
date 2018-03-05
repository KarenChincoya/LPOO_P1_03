/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

/**
 *
 * @author Karen Velasco
 */
public class Park {
    private String name;
    private Integer size;
    private boolean picnicFacilities;
    private boolean tennisCourt;
    private boolean playground;
    private boolean swimmingPool;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSize(Integer size){
        if(size>400 || size<0){
            System.out.println("ERROR. Enter a correct value. ");
        }else{
            this.size = size;
        }
    }
    public Integer getSize(){
        return size;
    }
    public void setPicnicFacilities(boolean pF){
        this.picnicFacilities = pF;
    }
    public boolean getPicnicFacilities(){
        return picnicFacilities;
    }
    public void setTennisCourt(boolean pF){
        this.tennisCourt = pF;
    }
    public boolean getTennisCourt(){
        return tennisCourt;
    }
    public void setPlayground(boolean pF){
        this.playground = pF;
    }
    public boolean getPlayground(){
        return playground;
    }
    public void setSwimmingPool(boolean pF){
        this.swimmingPool = pF;
    }
    public boolean getSwimmingPool(){
        return swimmingPool;
    }
    
    public boolean picnicAndPlayground(){
        if(getPicnicFacilities() && getPlayground()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean allServices(){
        if(getPicnicFacilities() && getPlayground() && getSwimmingPool() && getTennisCourt()){
            return true;
        }else{
            return false;
        }
    }
    
    public Integer numberOfFacilities(){
        Integer cont = 0;
        if(getPicnicFacilities())
            cont++;
        if(getPlayground())
            cont++;
        if(getSwimmingPool())
            cont++;
        if(getTennisCourt())
            cont++;
        return cont;
    }
    
    public Park largerPark(Park p1, Park p2){
        if(p1.getSize()>p2.getSize())
            return p1;
        else
            return p2;
    }
}
