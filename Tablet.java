/**
 * Session 3 Take Home Lab (Enchanced Tablet Class)
 * 
 * @author Krzysztof Szczurowski
 * @date 10/10/2016
 * @version 1.1 //more in Readme.txt
 * @since 10/10/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2074865/View
 */
public class Tablet
{
    // instance variables
    private String brand; // e.g., Samsung
    private String model; // e.g., Note 7
    private double lcdWidth; // in inches, e.g., 8.9
    private double hardDriveSize; // in GB, e.g., 64
    private double weight; // in grams, e.g., 436
    private int memory; // in GB, e.g., 2
    private String operatingSystem; //  e.g., Android Nougat
    private String cpu; //e.g., Intel
    private boolean hasUsbPort; //true/false
    private int chargeDuration; //e.g. 7h
    
    /**
     * Parameterless constructor for objects of class Tablet,
     * Initializing all local variables to specified, default values
     */
    public Tablet()
    {
       this.brand = "Samsung";
       this.model = "Note 7";
       this.lcdWidth = 8.9;
       this.hardDriveSize = 64;
       this.weight = 360;
       this.memory = 2;
       this.operatingSystem = "Android Nougat";
       this.cpu = "Snapdragon 821";
       this.hasUsbPort = true;
       this.chargeDuration = 7;
    }
    
    
    /**
     * Custom constructor which takes paramters: number equals number of private instance variables
     * @param brand as String;
     * @param model as String;
     * @param lcdWidth as double;
     * @param hardDriveSize as double;
     * @param weight as double;
     * @param memory integer;
     * @param operatingSystem as String;
     * @param cpu as String;
     * @param hasUspPort as boolean;
     * @param chargeDuration as integer;
     */
    public Tablet(String brand, String model, double lcdWidth, double hardDriveSize, double weight, 
                  int memory, String operatingSystem, String cpu, boolean hasUsbPort, int chargeDuration )
    {
        setBrand(brand);
        setModel(model);
        setLcdWidth(lcdWidth);
        setHardDriveSize(hardDriveSize);
        setWeight(weight);
        setMemory(memory);
        setOperatingSystem(operatingSystem);
        setCpu(cpu);
        setUsbPort(hasUsbPort);
        setChargeDuration(chargeDuration);
    }
    
    //Accessors/Mutators (Properties)
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Brand <br>
     * no input parameter
     * @return returns Brand as String;
     */
    public String getBrand()
    {
        return this.brand;
    }
    
    /**
     * Public Mutator/Setter to setup the state for the Brand value <br>
     * no return value
     * @param  Brand value as String
     */
    public void setBrand(String value)
    {
        this.brand = (value == null || value.equals("") ? "Google" : value);
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Model <br>
     * no input parameter
     * @return returns Model as String
     */
    public String getModel()
    {
        return this.model;
    }
    
    /**
     * Public Mutator/Setter to setup the state for the Model value <br>
     * no return value
     * @param Model value as String
     */
    public void setModel(String value)
    {
        this.model = (value == null || value.equals("") ? "Nexus 9" : value);
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Model <br>
     * no input parameter
     * @return returns Model as Double
     */
    public double getLcdWidth()
    {
        return this.lcdWidth;
    }
    
    /**
     * Public Mutator/Setter to setup the state for the LCD Width value <br>
     * no return value
     * @param  LCD Width value as Double
     */
    public void setLcdWidth(double value)
    {
        this.lcdWidth = (value < 0 ? 8.9 : value);
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's HardDrive value <br>
     * no input parameter
     * @return returns HardDrive as Double
     */
    public double getHardDriveSize()
    {
        return this.hardDriveSize;
    }
    
    /**
     * Public Mutator/Setter to setup the state for the HardDrive value <br>
     * no return value
     * @param  HardDrive value as Double
     */
    public void setHardDriveSize(double value)
    {
        this.hardDriveSize = (value < 0 ? 0 : value);
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's weight value <br>
     * no input parameter
     * @return returns weight as double
     */
    public double getWeight()
    {
        return this.weight;
    }
    
    /**
     * Public Mutator/Setter to setup the state for Weight value <br>
     * no return value
     * @param  Weight value as Double
     */
    public void setWeight(double value)
    {
        this.weight = value < 0 ? 0 : value;
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Memory value <br>
     * no input parameter
     * @return returns Memory as Integer
     */
    public int getMemory()
    {
        return this.memory;
    }
    
    /**
     * Public Mutator/Setter to setup the state for Memory value <br>
     * no return value
     * @param  Memory value as Integer
     */
    public void setMemory(int value)
    {
        this.memory = (value < 0 ? 0 : value);
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Operating System <br>
     * no input parameter
     * @return returns Operating System as String
     */
    public String getOperatingSystem()
    {
        return this.operatingSystem;
    }
    
    /**
     * Public Mutator/Setter to setup the state for the Operating System value <br>
     * no return value
     * @param  Operating System value as String
     */
    public void setOperatingSystem(String value)
    {
        this.operatingSystem = (value == null || value.equals("") ? "Android" : value);
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's CPU <br>
     * no input parameter
     * @return returns CPU as String
     */
    public String getCpu()
    {
        return this.cpu;
    }
    
    /**
     * Public Mutator/Setter to setup the state for the CPU value <br>
     * no return value
     * @param  CPU value as String
     */
    public void setCpu(String value)
    {
        this.cpu = (value == null || value.equals("") ? "Intel" : value);
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's USB Port value <br>
     * no input parameter
     * @return returns hasUsbPort as Boolean
     */
    public boolean hasUsbPort()
    {
        return this.hasUsbPort;
    }
    
    /**
     * Public Mutator/Setter to setup the state for the hasUsbPort value <br>
     * no return value
     * @param  hasUsbPort value as Boolean
     */
    public void setUsbPort(boolean value)
    {
        this.hasUsbPort = value;
    }
    
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Charge Duration <br>
     * no input parameter
     * @return returns duration of charge as integer
     */
    public int getChargeDuration()
    {
        return this.chargeDuration;
    }
    
     /**
     * Public Mutator/Setter to setup the state for the Charge Duration value <br>
     * no return value
     * @param  Charge Duration value as Integer
     */
    public void setChargeDuration(int value)
    {
        this.chargeDuration = (value < 0 ? 0 : value);
    }
    
    //public methods
    /**
     * Public method taking NO parameters and returning NO values.
     * Purpose of this method is to print Tablet details to the screen, each detail in its own line
     */
    public void printDetails()
    {
        System.out.println("Brand:\t\t\t" + brand + "\nModel:\t\t\t" + model + "\nLCD Width:\t\t" + lcdWidth + "\nHarddrive Size:\t\t" + hardDriveSize + "\nWeight:\t\t\t" + weight +
        "\nMemory:\t\t\t" + memory + "GB" + "\nOperating System:\t" + operatingSystem + "\nCPU:\t\t\t" + cpu + "\nCharge Duration:\t" + chargeDuration + "h");
    }
    
    
    /**
     * Public method which takes NO parameters and returns a long unformatted String,
     * containing all details of the Tablet class
     * @return returns long string containing details of Tablet class, as String
     */
    public String getDetails()
    {
        return "Brand: " + brand + " Model: " + model + " CD Width: " + lcdWidth + " Harddrive Size: " + hardDriveSize + " Weight: " + weight +
        " Memory: " + memory + "GB" + " Operating System: " + operatingSystem + " CPU: " + cpu + " Charge Duration: " + chargeDuration + "h";
    }

    /**
     * Standard public method available outside of the class
     * Return value: String with the name of the class which created this object
     */
    public String whatsMyName()
    {
        return getClass().getName();
    }
}
