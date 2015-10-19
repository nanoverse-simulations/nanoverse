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
package nanoverse.compiler.pipeline.instantiate.factory.processes.discrete.filter;

import nanoverse.compiler.pipeline.instantiate.factory.Factory;
import nanoverse.runtime.processes.discrete.filter.SampleFilter;

import java.util.Random;

public class SampleFilterFactory implements Factory<SampleFilter> {

    private final SampleFilterFactoryHelper helper;

    private int maximum;
    private Random random;

    public SampleFilterFactory() {
        helper = new SampleFilterFactoryHelper();
    }

    public SampleFilterFactory(SampleFilterFactoryHelper helper) {
        this.helper = helper;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public SampleFilter build() {
        return helper.build(maximum, random);
    }
}