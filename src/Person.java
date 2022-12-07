public class Person {
    //AGE RANDOM NUMBER INT
    private int age = (int) Math.floor(Math.random()*(80-5+1)+5);
    //CONSTRUCTOR METHOD
    public Person(){
        this.age=age;
        System.out.println("The age is "+age);
    }
    //GET LIFE STAGE METHOD
    public void getLifeStage(){
        if (age<=12){
            System.out.println("The person is in the Child stage of life");
        } else if (age>12 && age<19) {
            System.out.println("The person is in the Teen stage of life");
        }else if (age>19 && age<59){
            System.out.println("The person is in the Adult stage of life");
        }else if (age>59){
            System.out.println("The person is in the Senior Adult stage of life");
        }
    }
}
