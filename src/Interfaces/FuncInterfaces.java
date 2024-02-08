package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class FuncInterfaces {
    public static void main(String[] args) {

        //Функц выражение
        ElectricalDevice lamp = state->{
            System.out.println(state?"лампочка включена":"лампочка выключена");
        };

        new Button(state->{
            System.out.println(state?"лампочка включена":"лампочка выключена");
        }).switchOnOff();
        //button.switchOnOff();

        Button button1 = new Button(new Iron()); //анонимный объект
        button1.switchOnOff();

        new Button(new ElectricalDevice() { //Анонимный класс, анонимный объект
            @Override
            public void switchOnOff(boolean state) {
                System.out.println(state?"фен включен":"фен выключен");
            }
        }).switchOnOff();



    }

}

//Электрическая кнопка
class Button{
    protected boolean state = false; //Кнопка выключена
    private ElectricalDevice device;

    public Button(ElectricalDevice device) {
        this.device = device;
    }

    Button() {
    }


    public void switchOnOff(){
        state = !state;
        if (state)
            System.out.println("Кнопка включена");
        else
            System.out.println("Кнопка выключена");
        device.switchOnOff(state);
    }
}

@FunctionalInterface
interface ElectricalDevice{
    void switchOnOff(boolean state); //Только один
}

class Iron implements ElectricalDevice{

    @Override
    public void switchOnOff(boolean state) {
        System.out.println(state?"утюг включен":"утюг выключен");
    }
}
        class ButtonEx extends Button{
            private List<ElectricalDevice> devices;

            public ButtonEx(List<ElectricalDevice> devices) {
                this.devices = devices;
            }

            public void switchOnOff(){
                state = !state;
                if (state)
                    System.out.println("Кнопка включена");
                else
                    System.out.println("Кнопка выключена");

                for (ElectricalDevice device:devices)
                    device.switchOnOff(state);
            }
        }