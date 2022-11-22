package ananimusinner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MonitoringSystem generaIndicatorMonitoringModule = new MonitoringSystem(){

            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");
            }
        };
        MonitoringSystem errorMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };

        generaIndicatorMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityModule.startMonitoring();.


        Scanner in = new Scanner(System.in){};



        /*
        * new <Имени НЕТ> <Клас Родительский/Реализуемый интерфейс>(передаём параметры конструктора родителя){
        * };
        */
    }
}

/*
class GeneraIndicatorMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал!");
    }
}

class ErrorMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал!");
    }
}

class SecurityModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал!");
    }
}*/

