package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();


    }

    static class ButtonClickHandler implements EventHendler{
        public void execute(){
            System.out.println("Кнопка нажата");
        }
    }
    interface EventHendler{
        void execute();
    }
    static class Button{
        EventHendler handler;
        Button(EventHendler action){
            this.handler=action;
        }
        public void click(){
            handler.execute();
        }
    }
}