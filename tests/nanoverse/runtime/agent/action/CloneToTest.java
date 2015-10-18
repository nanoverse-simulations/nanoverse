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

package nanoverse.runtime.agent.action;

import nanoverse.runtime.agent.Agent;
import nanoverse.runtime.agent.targets.MockTargetRule;
import nanoverse.runtime.geometry.Geometry;
import nanoverse.runtime.geometry.boundaries.*;
import nanoverse.runtime.geometry.lattice.*;
import nanoverse.runtime.geometry.shape.*;
import nanoverse.runtime.layers.cell.AgentLayer;
import org.junit.*;
import test.LegacyLatticeTest;

import java.util.*;
import java.util.function.Supplier;

import static org.junit.Assert.*;

public class CloneToTest extends LegacyLatticeTest {

    private static final String MOCK_PROGENY_NAME = "progeny";
    private Agent original;
    private MockTargetRule targetRule;
    private CloneTo query;
    private Random random;
    private Supplier<Agent> supplier;

    @Override
    @Before
    public void setUp() throws Exception {
        fail("To be combined with other 'expand' processes");
//        super.setUp();
//
//        // Create mock targeter that lists other two sites as targets.
//        targetRule = new MockTargetRule();
//        List<Coordinate> targets = new ArrayList<>(2);
//        targets.add(x);
//        targets.add(y);
//        targetRule.setTargets(targets);
//
//        supplier = mock(Supplier.class);
//        when(supplier.get()).thenReturn(new MockAgent(MOCK_PROGENY_NAME),
//            new MockAgent(MOCK_PROGENY_NAME));
//
//        // Place a single cell at origin.
//        original = new Agent(layerManager, 1, 1.0, 1.0, supplier);
//        BehaviorDispatcher bd = new BehaviorDispatcher();
//        original.setDispatcher(bd);
//
//        cellLayer.getUpdateManager().place(original, origin);
//
//        random = new Random(RANDOM_SEED);
//        // Create query.
//        query = new CloneTo(original, layerManager, targetRule, false, null,
//            null, random);

    }

    @Test
    public void testLifeCycle() throws Exception {
        fail("Rewrite as a modern test");
        // Trigger the replicate event.
//        query.run(null);
//
//        // The other two sites should be occupied.
//        assertTrue(cellLayer.getViewer().isOccupied(x));
//        assertTrue(cellLayer.getViewer().isOccupied(y));
//
//        assertEquals(MOCK_PROGENY_NAME, cellLayer.getViewer().getAgent(x).getName());
//        assertEquals(MOCK_PROGENY_NAME, cellLayer.getViewer().getAgent(y).getName());
    }

    /**
     * Integration test using replacement process.
     *
     * @throws Exception
     */
    @Test
    public void testReplacement() throws Exception {
        fail("Rewrite as a modern test");
//        AgentLayer layer = linearLayer(false);
//        Agent agent = layer.getViewer().getAgent(new Coordinate2D(4, 0, 0));
//
//        // Divide agent at position 4 toward 5
//        agent.trigger("replicate-self", null);
//
//        // New configuration: _123446_89
//        assertEquals(4, layer.getViewer().getName(new Coordinate2D(4, 0, 0)));
//        assertEquals(4, layer.getViewer().getName(new Coordinate2D(5, 0, 0)));
//        assertEquals(6, layer.getViewer().getName(new Coordinate2D(6, 0, 0)));
//        assertFalse(layer.getViewer().isOccupied(new Coordinate2D(7, 0, 0)));
    }

    /**
     * _123456_89  Initial condition
     * ^       (Agent to be divided)
     */
    private AgentLayer linearLayer(boolean shoving) throws Exception {
        Lattice lattice = new RectangularLattice();
        Shape shape = new Rectangle(lattice, 10, 1);
        Boundary boundary = new Periodic(shape, lattice);
        Geometry geom = new Geometry(lattice, shape, boundary);
        AgentLayer layer = new AgentLayer(geom);
        layerManager.setAgentLayer(layer);
        placeAgents(layer, shoving);

        return layer;
    }

    private void placeAgents(AgentLayer layer, boolean shoving) throws Exception {
        for (int x = 1; x < 7; x++) {
            placeNumberedAgent(x, layer, shoving);
        }

        for (int x = 8; x <= 9; x++) {
            placeNumberedAgent(x, layer, shoving);
        }
    }

    private void placeNumberedAgent(int x, AgentLayer layer, boolean shoving) throws Exception {
//        Supplier<Agent> ncSupplier = mock(Supplier.class);
//        Agent child = new MockAgent(x);
//        when(ncSupplier.get()).thenReturn(child);
//        Agent cell = new Agent(layerManager, x, x, x, ncSupplier);
//        Coordinate coord = new Coordinate2D(x, 0, 0);
//        layer.getUpdateManager().place(cell, coord);
//        BehaviorDispatcher bd = new BehaviorDispatcher();
//        cell.setDispatcher(bd);
//
//        MockTargetRule mtr = new MockTargetRule();
//
//        // Agents always divide to the right
//        Coordinate target = new Coordinate2D(x + 1, 0, 0);
//        List<Coordinate> targets = new ArrayList<>(1);
//        targets.add(target);
//        mtr.setTargets(targets);
//
//        CloneTo cloneTo = new CloneTo(cell, layerManager, mtr,
//            shoving, null, null, random);
//
//        Action behavior = new CompoundAction(cell, layerManager, new Action[]{cloneTo});
//        bd.map("replicate-self", behavior);
    }

}