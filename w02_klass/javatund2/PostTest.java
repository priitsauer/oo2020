public class PostTest {

    public static void main(String[] args) {
        Package package1 = new Package("12345",  PackageType.EXPRESS, PackageSizeType.BIG, PackageWeight.HEAVY);
        
        System.out.println(package1.getPrice());
    
    
    }


}