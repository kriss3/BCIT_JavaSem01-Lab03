/**
 * Session 3 Take Home Lab (Enchanced Tablet Class)
 * 
 * @author Krzysztof Szczurowski
 * @date 10/10/2016
 * @version 1.1
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
     * @param brand;
     * @param model;
     * @param lcdWidth;
     * @param hardDriveSize;
     * @param weight;
     * @param memory;
     * @param operatingSystem;
     * @param cpu;
     * @param hasUsbPort;
     * @param chargeDuration;
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
        //why not setting up hasUsbPort? -- did we forget?
        setChargeDuration(chargeDuration);
    }
    
    //Accessors/Mutators (Properties)
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Brand
     * @return returns Brand as String;
     */
    public String getBrand()
    {
        return this.brand;
    }
    
    public void setBrand(String value)
    {
        this.brand = (value == null || value.equals("") ? "Google" : value);
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Model
     * @return returns Model as String
     */
    public String getModel()
    {
        return this.model;
    }
    
    public void setModel(String value)
    {
        this.model = (model == null || model.equals("") ? "Nexus 9" : model);
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Model
     * no input parameter
     * @return returns Model as String
     */
    public double getLcdWidth()
    {
        return this.lcdWidth;
    }
    
    public void setLcdWidth(double value)
    {
        this.lcdWidth = value < 0 ? 8.9 : value;
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Model
     * no input parameter
     * @return returns Model as String
     */
    public double getHardDriveSize()
    {
        return this.hardDriveSize;
    }
    
    public void setHardDriveSize(double value)
    {
        this.hardDriveSize = value < 0 ? 0 : value;
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's weight value
     * no input parameter
     * @return returns weight as double
     */
    public double getWeight()
    {
        return this.weight;
    }
    
    public void setWeight(double value)
    {
        this.weight = value < 0 ? 0 : value;
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Memory value
     * no input parameter
     * @return returns Memory as Integer
     */
    public int getMemory()
    {
        return this.memory;
    }
    
    public void setMemory(int value)
    {
        this.memory = value < 0 ? 0 : value;
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Operating System
     * no input parameter
     * @return returns Operating System as String
     */
    public String getOperatingSystem()
    {
        return this.operatingSystem;
    }
    
    public void setOperatingSystem(String value)
    {
        this.operatingSystem = value == null ? "Android" : value;
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's CPU
     * no input parameter
     * @return returns CPU as String
     */
    public String getCpu()
    {
        return this.cpu;
    }
    
    public void setCpu(String value)
    {
        this.cpu = cpu == null ? "Intel" : cpu;
    }
    
    /**
     * Public Accessor/Getter to retrieve the current state of tablet's Charge Duration
     * no input parameter
     * @return returns duration of charge as integer
     */
    public int getChargeDuration()
    {
        return this.chargeDuration;
    }
    
    public void setChargeDuration(int value)
    {
        this.chargeDuration = chargeDuration < 0 ? 0 : chargeDuration;
    }
    
    //public methods
    /**
     * Public method taking NO parameters and returning NO values.
     * Purpose of this method is to print Tablet details to the screen, each detail in its own line
     */
    public void printDetails()
    {
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nLCD Width: " + lcdWidth + "\nHarddrive Size: " + hardDriveSize + "\nWeight: " + weight +
        "\nMemory: " + memory + "\nOperating System: " + operatingSystem + "\nCPU: " + cpu + "\nCharge Duration: " + chargeDuration);
    }
    
    
    /**
     * Public method which takes NO parameters and returns a long unformatted String,
     * containing all details of the Tablet class
     * @return returns long string containing details of Tablet class, as String
     */
    public String getDetails()
    {
        return "Brand: " + brand + " Model: " + model + " CD Width: " + lcdWidth + " Harddrive Size: " + hardDriveSize + " Weight: " + weight +
        " Memory: " + memory + " Operating System: " + operatingSystem + " CPU: " + cpu + " Charge Duration: " + chargeDuration;
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
