package org.example;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.text.Text;



public class javafxController {

    @FXML
    private Text myTest;


    public javafxController() {
        //初始化
        //可以继承一个监听接口

        Platform.runLater(() -> {
        //其他线程调用组件,可以用这个进行保护


            myTest.setText("list all");
        });

    }

}

