public interface Enclosure{
    int fishperenclosure = 12;
    int tigersperenclosure=2;
    int defaultperenclosure= 1;
}
public class animal implements Enclosure{
    private String type;
    private int occupnacy;
}

//defaultconstructor 
public animal() {
    this.type="undefined";
    this.occupancy= Enclosure.defaultperenclosure;
}
//parameterizedconstructor
public animal(String type, int occupancy){
    this.type=type;
    this.occupancy=occupancy;
}
//tostringmethod
    public String toString(){
    return "Number of"+this.type+"per enclosure is"+this.occupancy;
}
public class fish extends animal{
    private String waterType;
    //parameterizedconstructor
    public fish(String type, String waterType){
        super(type,10);
        this.waterTType=waterType;
    }
//tostringmethod
        public String toString(){
    return "Fish:"+super.toString()+"swims in"+this.waterType;
}
}
public class tiger extends animal{
    private String habitat;
    public tiger(Strinf type, String habitat){
        super(type, 2);
        this.habitat=habitat;
    }  
        public String toString(){
    return "Tiger:"+super.toString()+"roams in"+this.habitat;
        }
    }
//creatingfishandtigerobjects
public class menagrie{
    public static void main(String[] args){
        tiger t1=new tiger("Javan tiger", "tiger acreage #6");
        fish f1=new fish("false network catfish", "fresh water");
        tiger t2=new tiger("bengal tiger", "ritchie area of rit");
        fish f2=new fish("shark", "saltwater");
        tiger t3=new tiger("siberian tiger", "tiger acreage #4");
    }
}
//addingobjectstoanarray
Animal[] animals=new animal[]{t1, f1, t2, f2, t3};
System.out.println("Animals in menagerie:");
int fishcount=0;
int tigercount=0;
for(Animal animal : animals){
    System.out.println(animal.toString());
    if (animal instanceof fish){
        fishcount++
    } else if(animal instanceof Tiger){
        tigercount++
    }
}
//printsummarycount
System.out.println("Number of fish"+fishcount);
System.outprintln("Number of tigers:"+fishcount);
