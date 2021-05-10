
public class main {

   
    public static void main(String[] args) {
        PetFoods petFoods1 = new PetFoods("Royal Canin", 1,"Weet Food",60);
        PetFoods petFoods2 = new PetFoods("Royal Canin", 2,"Dry Food", 80);
        PetFoods petFoods3 = new PetFoods("Pro Plan", 3, "Capsul Food",45);
        
        PetFoods[] petFoods ={petFoods1,petFoods2,petFoods3};
        for(PetFoods foods : petFoods){
            System.out.println(foods.brand);
        }
        System.out.println(petFoods.length);
        
        
        Category category1 = new Category();
        category1.name = "Electronics Devices";
        category1.id = 1;
        Category category2 = new Category();
        category2.name = "Architecture";
        category2.id = 2;
        
        PetFoodsManager manager = new PetFoodsManager();
        
        manager.addToCart(petFoods1);
        manager.addToCart(petFoods2);
        manager.addToCart(petFoods3);
        
        manager.askQuestionToSeller(petFoods1);
        manager.askQuestionToSeller(petFoods2);
        manager.askQuestionToSeller(petFoods3);
        
        
        
        
    }
    
}
