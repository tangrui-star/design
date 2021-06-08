package principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runRaod("汽车");
        vehicle.runWater("轮船");
        vehicle.runAir("飞机");
    }
}


// 方式3
// 1. 没有对原本的类做改动，只是增加了方法
// 2. 虽然在类上没有遵守单一职责原则，但是在方法上遵守单一职责原则
class Vehicle2 {
    public void runRaod(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空运行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上运行");
    }
}