/*
 * Copyright (c) 2021 shedaniel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.shedaniel.architectury.annotations;

import org.intellij.lang.annotations.MagicConstant;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks the annotated method to only be available on specific modding platforms.
 *
 * <p>The annotated method can be a static method or an instance method - this annotation
 * works on both.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface PlatformOnly {
    String FABRIC = "fabric";
    String FORGE = "forge";

    /**
     * The platforms that the annotated method is available on.
     *
     * <p>The values of this array can be any platform name strings,
     * but only {@link #FABRIC} and {@link #FORGE} are recognised by default.
     *
     * @return the platforms
     */
    @MagicConstant(stringValues = { FABRIC, FORGE })
    String[] value();
}
