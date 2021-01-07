/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.swing.derivable_icons;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 * Interfaz a implementar por los Iconos que permiten el derive a diferentes
 * colores y tamaños.
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public abstract class DerivableIcon extends ImageIcon {

    public DerivableIcon() {
        super();
    }

    public DerivableIcon(ImageIcon icon) {
        super(icon.getImage());
    }

    public DerivableIcon(Image icon) {
        super(icon);
    }

    public DerivableIcon(BufferedImage icon) {
        super(icon);
    }

    /**
     * Derive the icon to the specified size, both width and height will take
     * the same value as size.
     *
     * @param size the w and h of the result icon.
     * @return The icon.
     */
    public abstract DerivableIcon deriveIcon(float size);

    /**
     * Derive the icon to the specified Color, it will fill the icon with the
     * color.
     *
     * @param color the fill color of the resulting icon.
     * @return The icon.
     */
    public abstract DerivableIcon deriveIcon(Color color);

    public abstract Color getColor();

    public abstract float getSize();
}
