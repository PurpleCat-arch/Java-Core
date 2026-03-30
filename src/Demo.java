class Laptop {
    String model;
    int price;
    String color;   
    public String toString(){
        return "model: "+model+" price: "+price+" color: "+color;
    }
}

class Demo{
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo";
        obj.price = 150000;
        obj.color = "Grey";
        System.out.println(obj);
        
    }
}