package principle.singleresponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("火车");
        vehicle.run("飞机");
    }
}

// 交通工具类
// 方式1
// 1. 很显然违背了 单一职责原则
// 2. 根据 交通工具运行方式，分为不同的类
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }
}