/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

/**
 *
 * @author mpanagrosso
 */
public class PluginConfiguration {

    private Stage mainStage;
    private MenuBar menuBar;

    public PluginConfiguration(Stage mainStage, MenuBar menuBar) {
        this.mainStage = mainStage;
        this.menuBar = menuBar;
    }

    public Stage getMainStage() {
        return mainStage;
    }

    public MenuBar getMenubar() {
        return menuBar;
    }

}
