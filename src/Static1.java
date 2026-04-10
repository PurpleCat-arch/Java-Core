class Static1{
    static int a=10;
    
    Static1(){
        a++;
    }
    
    public static void main(String[] args){
        Static1 s1=new Static1();
        Static1 s2=new Static1();
        Static1 s3=new Static1();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Value of a: "+a);
    }
}