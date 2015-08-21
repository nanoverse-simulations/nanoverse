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

package compiler.pipeline.instantiate.loader.io.serialize.binary;

import compiler.pipeline.instantiate.factory.io.serialize.binary.ContinuumStateWriterFactory;
import compiler.pipeline.instantiate.loader.io.serialize.OutputLoader;
import compiler.pipeline.translate.nodes.MapObjectNode;
import control.GeneralParameters;
import io.serialize.Serializer;
import io.serialize.binary.ContinuumStateWriter;
import layers.LayerManager;

/**
 * Created by dbborens on 8/10/2015.
 */
public class ContinuumStateWriterLoader extends OutputLoader<ContinuumStateWriter> {
    private final ContinuumStateWriterFactory factory;

    public ContinuumStateWriterLoader() {
        factory = new ContinuumStateWriterFactory();
    }

    public ContinuumStateWriterLoader(ContinuumStateWriterFactory factory) {
        this.factory = factory;
    }

    @Override
    public Serializer instantiate(MapObjectNode node, GeneralParameters p, LayerManager layerManager) {
        factory.setP(p);
        factory.setLm(layerManager);
        return factory.build();
    }
}
