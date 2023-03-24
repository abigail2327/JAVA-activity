import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Menagerie {
    
    public static void main(String[] args) {
        int fish=0;
        int tiger=0;

        Tiger t1 = new Tiger("Javan tiger", "tiger acreage #6");
        Fish f1 = new Fish("false network catfish", "fresh water");
        Tiger t2 = new Tiger("Bengal tiger", "ritchie area of rit");
        Fish f2 = new Fish("shark", "saltwater");
        Tiger t3 = new Tiger("Siberian tiger", "tiger acreage #4");
        Animal[] animals = {t1, f1, t2, f2, t3};
        System.out.println("Animals in menagerie:");
        
        File file=new File("output.txt");

        try {
            if(file.createNewFile()){
                System.out.println("Creating a new file:"+file.getName());
            }else{
                System.out.println("Adding to current file"+file.getName());
            }
            
        } catch (Exception e) {}
        
        
        System.out.println();
        System.out.println("Report on animals");

        try{
        FileWriter writer=new FileWriter(file);
        PrintWriter pw = new PrintWriter(writer);
        for (Animal animal : animals) {
            System.out.println(animal);
            pw.println(animal);
            if (animal instanceof Fish) {
                fish++;
            } else if (animal instanceof Tiger) {
                tiger++;
            }
        }
        pw.flush();
        pw.close();
    System.out.println("Number of fish: " + fish);
    System.out.println("Number of tigers: " + tiger);
}catch(IOException e){}}}