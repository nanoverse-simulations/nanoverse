/*
 * Copyright (c) 2014, 2015 David Bruce Borenstein and the
 * Trustees of Princeton University.
 *
 * This file is part of the Nanoverse simulation framework
 * (patent pending).
 *
 * This program is free software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General
 * Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU Affero General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Affero General
 * Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package loaders;

import compiler.pipeline.translate.symbol.MapSymbolTable;
import factories.FactoryGenerator;
import factories.FactoryWriter;
import factories.TargetFinder;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Created by dbborens on 8/1/2015.
 */
public class Sandbox {

    public static void main(String[] args) {
        TargetFinder tf = new TargetFinder();
        FactoryWriter fw = new FactoryWriter("meta/out/factory/");

        tf.getTargets()
                .forEach(fw::write);
    }
}
