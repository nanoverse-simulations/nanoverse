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

package nanoverse.runtime.agent.targets;

import nanoverse.runtime.cells.MockAgent;
import nanoverse.runtime.control.arguments.ConstantInteger;
import nanoverse.runtime.control.identifiers.*;
import nanoverse.runtime.geometry.MockGeometry;
import nanoverse.runtime.layers.MockLayerManager;
import nanoverse.runtime.layers.cell.AgentLayer;
import nanoverse.runtime.processes.discrete.filter.*;
import org.junit.*;
import test.LegacyTest;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by dbborens on 2/10/14.
 */
public class TargetRuleTest extends LegacyTest {

    private MockGeometry geom;
    private MockLayerManager layerManager;
    private AgentLayer cellLayer;
    private MockAgent self, occupiedNeighbor;
    private Coordinate[] cc, neighbors;
    private Coordinate left, right, center;
    private Random random;
    private Filter filter;

    @Before
    public void setUp() throws Exception {
        fail("Rewrite each test as its own class test and use modern mocks");
        // Restart RN generator
//        random = new Random(RANDOM_SEED);
//
//        geom = new MockGeometry();
//
//        center = new Coordinate2D(1, 0, 0);
//        left = new Coordinate2D(0, 0, 0);
//        right = new Coordinate2D(2, 0, 0);
//
//        cc = new Coordinate[]{center, left, right};
//
//        geom.setCanonicalSites(cc);
//
//        layerManager = new MockLayerManager();
//        cellLayer = new AgentLayer(geom);
//        layerManager.setAgentLayer(cellLayer);
//
//        occupiedNeighbor = new MockAgent(1);
//        self = new MockAgent(2);
//
//        // Only one neighbor is occupied; the other is not.
//        cellLayer.getUpdateManager().place(self, center);
//        cellLayer.getUpdateManager().place(occupiedNeighbor, left);
//
//        // Associate the neighborhood with the coordinate
//        neighbors = new Coordinate[]{left, right};
//        geom.setAgentNeighbors(center, neighbors);
//
//        filter = new NullFilter();
    }

    @Test
    public void testTargetAllNeighbors() {
        fail("Rewrite each test as its own class test and use modern mocks");
//        TargetRule query = new TargetAllNeighbors(self, layerManager, filter, -1, random);
//
//        // Get target list
//        List<Coordinate> actual = query.report(null);
//        List<Coordinate> expected = Arrays.asList(neighbors);
//
//        // Should contain all neighbors
//        assertEquals(expected, actual);
    }

    @Test
    public void testTargetVacantNeighbors() {
        fail("Rewrite each test as its own class test and use modern mocks");
//        TargetRule query = new TargetVacantNeighbors(self, layerManager, filter, -1, random);
//
//        // Get target list
//        List<Coordinate> actual = query.report(null);
//        List<Coordinate> expected = new ArrayList<>(1);
//        expected.add(right);
//
//        assertEquals(expected, actual);
    }

    @Test
    public void testTargetOccupiedNeighbors() {
        fail("Rewrite each test as its own class test and use modern mocks");
//        TargetRule query = new TargetOccupiedNeighbors(self, layerManager, filter, -1, random);
//
//        // Get target list
//        List<Coordinate> actual = query.report(null);
//        List<Coordinate> expected = new ArrayList<>(1);
//        expected.add(left);
//
//        assertEquals(expected, actual);
    }

    @Test
    public void testTargetSelf() {
        fail("Rewrite each test as its own class test and use modern mocks");
//        TargetRule query = new TargetSelf(self, layerManager, filter, -1, random);
//
//        // Get target list
//        List<Coordinate> actual = query.report(null);
//        List<Coordinate> expected = new ArrayList<>(1);
//        expected.add(center);
//
//        assertEquals(expected, actual);
    }

    @Test
    public void testTargetCaller() {
        fail("Rewrite each test as its own class test and use modern mocks");
        // Left caller
//        TargetRule query = new TargetCaller(self, layerManager, filter, -1, random);
//        List<Coordinate> actual = query.report(occupiedNeighbor);
//        List<Coordinate> expected = new ArrayList<>(1);
//        expected.add(left);
//        assertEquals(expected, actual);

    }

    // Null caller: should blow up
    @Test
    public void testTargetCallerNull() {
        fail("Rewrite each test as its own class test and use modern mocks");
//        TargetRule query = new TargetCaller(self, layerManager, filter, -1, random);
//        boolean thrown = false;
//        try {
//            query.report(null);
//        } catch (IllegalStateException ex) {
//            thrown = true;
//        } catch (NullPointerException ex) {
//            fail();
//        }
//
//        assertTrue(thrown);
    }

    @Test
    public void testEquality() {
        fail("Rewrite each test as its own class test and use modern mocks");
//        // Equality is defined at the superclass level, so one test is sufficient.
//
//        TargetRule p, q, r;
//
//        // Make two targeters of the same class, but with different callbacks
//        p = new TargetSelf(new MockAgent(), layerManager, filter, -1, random);
//        q = new TargetSelf(new MockAgent(), layerManager, filter, -1, random);
//
//        // Make one targeter of a different class
//        r = new TargetCaller(new MockAgent(), layerManager, filter, -1, random);
//
//        // Test that the two of the same class are equal
//        assertEquals(p, q);
//
//        // Test that the two of different classes are not equal
//        assertNotEquals(p, r);
    }

    @Test
    public void testClone() {
        fail("Rewrite each test as its own class test and use modern mocks");
//        MockAgent parent = new MockAgent();
//        TargetRule[] rules = new TargetRule[]{
//            new TargetAllNeighbors(parent, layerManager, filter, -1, random),
//            new TargetCaller(parent, layerManager, filter, -1, random),
//            new TargetOccupiedNeighbors(parent, layerManager, filter, -1, random),
//            new TargetSelf(parent, layerManager, filter, -1, random),
//            new TargetVacantNeighbors(parent, layerManager, filter, -1, random)
//        };
//
//        for (TargetRule rule : rules) {
//            doCloneTest(rule, parent);
//        }
    }

    private void doCloneTest(TargetRule original, MockAgent parent) {
        MockAgent child = new MockAgent();
        TargetRule cloned = original.clone(child);
        assertEquals(original, cloned);
        assertEquals(parent, original.getCallback());
        assertEquals(child, cloned.getCallback());
    }

    /*
      All other tests are based on a no-maximum scheme, so an additional
      testNoMaximum method is not necessary.
     */
    @Test
    public void testMaximum() {
        fail("Rewrite each test as its own class test and use modern mocks");
//        TargetRule query = new TargetAllNeighbors(self, layerManager, filter, 1, random);
//
//        // Get target list
//        List<Coordinate> actual = query.report(null);
//        List<Coordinate> expected = new ArrayList<>(1);
//        expected.add(left);
//
//        assertEquals(expected, actual);
    }

    @Test
    public void testFilterApplied() throws Exception {
        fail("Rewrite each test as its own class test and use modern mocks");
//        MockAgent anotherNeighbor = new MockAgent(3);
//        cellLayer.getUpdateManager().place(anotherNeighbor, right);
//
//        filter = new AgentNameFilter(cellLayer, new ConstantInteger(1));
//        TargetRule query = new TargetAllNeighbors(self, layerManager, filter, -1, random);
//
//        List<Coordinate> actual = query.report(null);
//        List<Coordinate> expected = new ArrayList<>(1);
//        expected.add(left);
//
//        assertEquals(expected, actual);
    }
}
