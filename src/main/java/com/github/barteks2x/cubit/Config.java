/* 
 * The MIT License
 *
 * Copyright (C) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.barteks2x.cubit;

public interface Config {

    /**
     * This method returns config value for given config option name and type.
     * Several config options with the same name and different type are allowed.
     * <p>
     * @param <T>          Value type
     * @param name         Name of config value, dot separated path
     * @param defaultValue Default value returned if config option not found
     * <p>
     * @return Value for given config option, default value if not found
     */
    public <T> T get(String name, T defaultValue);

    /**
     * This method sets config value for given config option name and type.
     * Several config options with the same name and different type are allowed.
     * <p>
     * @param <T>   Value type
     * @param name  Name of config value, dot separated path
     * @param value Value to set
     */
    public <T> void set(String name, T value);

    public void reload();

    public void save();
}
