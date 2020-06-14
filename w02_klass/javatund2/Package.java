/**
 * PostOffice
 */
public class Package {

    private String packageName;
    PackageType packageType;
    PackageSizeType packageSizeType;
    PackageWeight packageWeight;

    public Package( String packageName, PackageType packageType, PackageSizeType packageSizeType, PackageWeight packageWeight){
        this.packageName = packageName;
        this.packageType = packageType;
        this.packageSizeType = packageSizeType;
        this.packageWeight = packageWeight;
    }
    
    public int getPrice(){
        int price = 0;
        if(packageType == packageType.EXPRESS){
            price++;   
        }
        if(packageSizeType == packageSizeType.MEDIUM){
            price++;
        }
        if(packageSizeType == packageSizeType.BIG){
            price++;
        }
        return price;
    }

   
 
   
}