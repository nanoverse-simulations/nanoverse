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

package compiler.pipeline.translate.symbol.agent.targets;

import agent.targets.*;
import compiler.pipeline.instantiate.loader.Loader;
import compiler.pipeline.instantiate.loader.agent.targets.TargetSelfLoader;
import compiler.pipeline.translate.nodes.ObjectNode;

/**
 * Created by dbborens on 7/23/2015.
 */
public class TargetSelfInstSymbolTable extends TargetRuleInstSymbolTable<TargetSelfDescriptor> {
    @Override
    public String getDescription() {
        return "Target the focal agent (i.e., the agent performing the action).";
    }

    @Override
    public Loader getLoader(ObjectNode node) {
        return new TargetSelfLoader();
    }
}
