package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName( String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
//        Beach beach1 = new Beach("Kata", 200, 1);
//        Beach beach2 = new Beach("Karon", 200, 1);
//        System.out.println(beach1.compareTo(beach2));


    }

    @Override
    public synchronized int compareTo(Beach o) {
        int result = 0;
        //проверим расстояние
        if (o.getDistance() > this.getDistance())
            result++;
        else if (o.getDistance() < this.getDistance())
            result--;

        //проверим quality
        if ( o.getQuality() > this.getQuality())
            result--;


        else if ( o.getQuality() < this.getQuality()){
            result ++;

        }
        return result;




    }
}
