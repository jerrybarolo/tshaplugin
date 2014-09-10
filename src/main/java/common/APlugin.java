/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import common.PluginConfiguration;

/**
 *
 * @author mpanagrosso
 */
public abstract class APlugin {

    protected PluginConfiguration configuration;

    public void configure(PluginConfiguration configuration) {
        this.configuration = configuration;

    }

    

    abstract public void stop();

    abstract public void start();
}
