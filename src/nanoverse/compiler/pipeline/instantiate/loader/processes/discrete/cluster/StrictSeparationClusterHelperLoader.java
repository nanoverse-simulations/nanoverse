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

package nanoverse.compiler.pipeline.instantiate.loader.processes.discrete.cluster;

import nanoverse.compiler.pipeline.instantiate.factory.processes.discrete.cluster.StrictSeparationClusterHelperFactory;
import nanoverse.compiler.pipeline.translate.nodes.MapObjectNode;
import nanoverse.runtime.control.GeneralParameters;
import nanoverse.runtime.layers.LayerManager;
import nanoverse.runtime.layers.cell.AgentLayer;
import nanoverse.runtime.processes.discrete.cluster.StrictSeparationClusterHelper;

/**
 * Created by dbborens on 8/29/15.
 */
public class StrictSeparationClusterHelperLoader extends ScatterClustersHelperLoader<StrictSeparationClusterHelper> {

    private StrictSeparationClusterHelperFactory factory;

    public StrictSeparationClusterHelperLoader() {
        this.factory = factory;
    }

    public StrictSeparationClusterHelperLoader
        (StrictSeparationClusterHelperFactory factory) {

        this.factory = factory;
    }

    public StrictSeparationClusterHelper instantiate(LayerManager lm, GeneralParameters p) {
        return instantiate(null, lm, p);
    }

    @Override
    public StrictSeparationClusterHelper instantiate(MapObjectNode node, LayerManager lm, GeneralParameters p) {
        AgentLayer layer = lm.getAgentLayer();
        factory.setLayer(layer);
        return factory.build();
    }
}
