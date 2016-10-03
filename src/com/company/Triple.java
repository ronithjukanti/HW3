package com.company;

public class Triple<S , D, I> {
    //fields
    private S left;
    private D middle;
    private I right;

    //constructor
    public Triple(S left, D middle, I right ){
        this.left = left;
        this.middle = middle;
        this.right = right;
    }
    // getters and setters
    public S getLeft() {return  left;}
    public void setLeft(S left) {this.left = left;}
    public  D getMiddle() {return middle;}
    public void setMiddle(D middle) {this.middle = middle;}
    public I getRight(){return right; }
    public void setRight (I right) { this.right = right;}

    public String toString () { return "("+left+","+middle+","+right+")";}


}