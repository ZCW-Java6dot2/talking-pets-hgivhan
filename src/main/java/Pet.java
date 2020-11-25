public class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(){
        name = "";
    }

    public String speak(){
        return "speech";
    }

    public void setName(String aName){
        this.name = aName;
    }

    public String getName(){
        return name;
    }
}
