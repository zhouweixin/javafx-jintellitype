package com.zhou.jintellitypedemo;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;
import com.melloware.jintellitype.JIntellitypeConstants;
import javafx.event.ActionEvent;

import javax.swing.*;

public class DemoController {
    public DemoController(){
        // 第一步：注册热键，第一个参数表示该热键的标识，第二个参数表示组合键，如果没有则为0，第三个参数为定义的主要热键
        JIntellitype.getInstance().registerHotKey(1, JIntellitypeConstants.MOD_ALT, (int)'S');
        JIntellitype.getInstance().registerHotKey(2, JIntellitypeConstants.MOD_ALT, (int)'Q');

        //第二步：添加热键监听器
        JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {

            @Override
            public void onHotKey(int markCode) {
                switch (markCode) {
                    case 1:
                        showMessage();
                        break;
                    case 2:
                        exist();
                        break;
                }
            }
        });
    }

    public void showMessage(){
        JOptionPane.showMessageDialog(null, "就算把窗口最小化，按快捷键Alt+S也可以弹出提示框哦！", "弹出框标题", JOptionPane.INFORMATION_MESSAGE);
    }

    public void exist(){
        System.exit(0);
    }

    public void minAction(ActionEvent actionEvent) {
        showMessage();
    }

    public void existAction(ActionEvent actionEvent) {
        exist();
    }


}
