/*
There are two memory, one of them heap and the other one is stack memory. Heap memory comes from the begining of the application
but the each seperate threads are created for stacks. Objects will fill the heap memory so the heap memory needs to be clean when
it finished lifecycle. Garbace collector will be in action in this status.
 */

package _1MemoryManagement;

public class GarbageCollection {
    public void finalize(){
        System.out.println("Garbages have been cleared!");
    } //We wrote this method because of to understand how be triggered garbace collector.

    public static void main(String[] args){
        GarbageCollection seckin = new GarbageCollection();
        GarbageCollection tuncay = new GarbageCollection();

        seckin = null;
        tuncay = seckin;

        System.gc(); //Garbace Collector is going to be trigger manuaally.
    }
}
