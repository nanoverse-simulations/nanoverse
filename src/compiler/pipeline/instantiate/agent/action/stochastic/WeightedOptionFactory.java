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

package compiler.pipeline.instantiate.agent.action.stochastic;

import agent.action.ActionDescriptor;
import agent.action.stochastic.WeightedOption;
import compiler.pipeline.instantiate.Factory;

/**
 * Created by dbborens on 7/29/2015.
 */
public class WeightedOptionFactory implements Factory<WeightedOption> {

    private ActionDescriptor action;
    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAction(ActionDescriptor action) {
        this.action = action;
    }

    public WeightedOption build() {
        return new WeightedOption(weight, action);
    }
}
