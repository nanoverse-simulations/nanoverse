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

package io.deserialize.continuum;

import control.identifiers.Coordinate;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by dbborens on 5/27/2015.
 */
public class ContinuumLayerViewer {

    private final Map<String, List<Double>> valueMap;
    private final double time;
    private final int frameNumber;

    public ContinuumLayerViewer(Map<String, List<Double>> valueMap, double time, int frameNumber) {
        this.valueMap = valueMap;
        this.time = time;
        this.frameNumber = frameNumber;
    }

    public Stream<Double> getValues(String id) {
        return valueMap.get(id).stream();
    }

    public double getTime() {
        return time;
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public double getValue(String id, int index) {
        return valueMap.get(id).get(index);
    }
}
