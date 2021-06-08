package principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle raodVehicle = new RoadVehicle();
        raodVehicle.run("汽车");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

// 交通工具类
// 方式1
// 1. 很显然违背了 单一职责原则
// 改进 2. 根据 交通工具运行方式，分为不同的类

// 方式2
// 1. 遵守了单一职责原则
// 2. 可以分析得到 过多的占用资源，对系统不利，类分解的同时，还需要改客户端
// 改进3. 直接修改VeHicle 类，
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上运行");
    }
}