import java.util.*;

public class SearchDemo {

    public static Product linearSearch(Product[] products,int id){
        for(Product p:products){
            if(p.productId==id) return p;
        }
        return null;
    }

    public static Product binarySearch(Product[] products,int id){
        int low=0,high=products.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(products[mid].productId==id) return products[mid];
            else if(products[mid].productId<id) low=mid+1;
            else high=mid-1;
        }
        return null;
    }

    public static void main(String[] args){
        Product[] products={
            new Product(101,"Laptop","Electronics"),
            new Product(102,"Phone","Electronics"),
            new Product(103,"Shoes","Fashion"),
            new Product(104,"Watch","Accessories"),
            new Product(105,"Book","Education")
        };

        System.out.println("Linear Search:");
        System.out.println(linearSearch(products,104));

        Arrays.sort(products,(a,b)->a.productId-b.productId);

        System.out.println("Binary Search:");
        System.out.println(binarySearch(products,104));
    }
}
