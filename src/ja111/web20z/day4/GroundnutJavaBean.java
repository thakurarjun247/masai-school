package ja111.web20z.day4;
//Java Bean or a POJO
public class GroundnutJavaBean {
    private String colorOfTheOuterShell;
    private Integer numberOfSeeds;
    //public getter and setter.
    //getter : reads the values



    public String getColorOfTheOuterShell(){
        return this.colorOfTheOuterShell;
    }

    public void setColorOfTheOuterShell(String colorOfTheOuterShell){
        this.colorOfTheOuterShell=colorOfTheOuterShell;
    }

    public Integer getNumberOfSeeds() {
        return numberOfSeeds;
    }

    public void setNumberOfSeeds(Integer numberOfSeeds) {
        this.numberOfSeeds = numberOfSeeds;
    }

    //zero arg cons. or a default cons.
    public GroundnutJavaBean(){

    }
    //optional step
    public GroundnutJavaBean(String colorOfTheOuterShell, Integer numberOfSeeds) {
        this.colorOfTheOuterShell = colorOfTheOuterShell;
        this.numberOfSeeds = numberOfSeeds;
    }
}
