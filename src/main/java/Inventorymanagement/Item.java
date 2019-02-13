package Inventorymanagement;

//Item for the warehouse
class Item {

    private long id;
    private String name;
    private double price; //TODO: Find out what the difference between float and double is. Pro's and cons of using both
    private int stock;

    private long getId(){
        return id;
    }

    private void setId(long id){
        this.id = id;
    }

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    private void deductStock(long stock) {
        if(this.stock - stock < 0){
            throw new IllegalArgumentException("Not enough stock to deduct. Stock would be less than 0");
        }
    }

    //Increase the stock by a certain amount
    private void increaseStock(long stock){
        this.stock += stock;
    }

    private boolean inStock(){
        return stock > 0;
    }

    private double getTotalCost(){
        return getPrice()*getStock();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(!(o instanceof Item)){
            return false;
        }

        Item item = (Item) o;

        return getId() == item.getId();
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}