/**
 * L
 * Copyright (c) 1991-2021 All Rights Reserved.
 */
package com.springboot.qa.qasystem.test;

/**
 *
 * @author L
 * @version 1.0: Animal.java, v 1.0 2021年01月04日 15:44 L Exp $
 */
public class Animal {

    public Animal() {
    }

    private String type;
    private String skin;
    private int    legCount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter method for property <tt>skin</tt>.
     *
     * @return property value of skin
     */
    public String getSkin() {
        return skin;
    }

    /**
     * Setter method for property <tt>skin</tt>.
     *
     * @param skin  value to be assigned to property skin
     */
    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }
}